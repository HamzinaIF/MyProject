package ru.innopolis.university.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    protected static final Map<String, Socket> allUsers = new HashMap<>();
    protected static boolean isListening = true;
    protected static int LISTEN_PORT = 9090;

    public static void main(String[] args) throws IOException {
        runServer();
    }

    private static void runServer() throws IOException {
        System.out.println("Server start");
        ServerSocket serverSocket = new ServerSocket(LISTEN_PORT);

        while (isListening) {
            Socket socket = serverSocket.accept();

            new Thread(() -> {
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                } catch (IOException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }

                String userName = null;
                try {
                    assert reader != null;
                    userName = reader.readLine();
                } catch (IOException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }

                System.out.println("Подключился - " + userName);

                synchronized (allUsers) {
                    allUsers.put(userName, socket);
                }

                while (socket.isConnected()) {
                    try {
                        String line = reader.readLine();
                        if (line == null) continue;
                        if (line.equals("exit")) {
                            socket.close();
                            break;
                        }
                        System.out.println(userName + " отправил: " + line);
                        if (checkOnUniCastMessage(line)) {
                            String destinationName = line.substring(0, line.indexOf(' '));
                            String message = line.substring(line.indexOf(' ') + 1);
                            sendUniCast(userName, destinationName, message);
                        } else {
                            sendBroadCast(userName, line);
                        }
                    } catch (IOException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                        break;
                    }
                }
            }).start();
        }
    }

    private static boolean checkOnUniCastMessage(String message) {
        for (String name : allUsers.keySet()) {
            if (message.startsWith(name)) return true;
        }
        return false;
    }

    private static void sendUniCast(String sender, String destination, String message) throws IOException {
        Socket clientSocket = allUsers.get(destination);
        if (clientSocket.isConnected()) {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println(sender + " отправил вам личное сообщение: " + message);
        }
    }

    private static void sendBroadCast(String user, String message) throws IOException {
        for (Map.Entry<String, Socket> entry : allUsers.entrySet()) {
            if (!user.equals(entry.getKey())) {
                Socket clientSocket = entry.getValue();
                if (clientSocket.isConnected()) {
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    out.println(user + " отправил вам сообщение: " + message);
                }
            }
        }
    }
}
