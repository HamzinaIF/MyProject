package ru.innopolis.university.lesson11;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    protected static int PORT = 9090;
    public static void main(String[] args) throws IOException {
        runClient();
    }
    private static void runClient() throws IOException {
        Socket socket = new Socket("localhost", PORT);
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()
                ));
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(
                             socket.getOutputStream()
                     ), true
             );
             Scanner console = new Scanner(System.in);
        ) {
            System.out.println("Введите имя и сообщение:");
            Thread listenIncomingMessages = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        System.out.println("Входящее сообщение: " + reader.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            listenIncomingMessages.start();
            while (true) {
                String line = console.nextLine();
                out.println(line);
                if ("exit".equals(line)) {
                    socket.close();
                    listenIncomingMessages.interrupt();
                    break;
                }
            }
        }
    }
}