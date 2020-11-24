package ru.innopolis.university.lesson10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static ru.innopolis.university.lesson10.Main.PATH;

public class SomeClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if ("SomeClass".equals(name)) {
            return findClass(name);
        }
        return super.loadClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if ("SomeClass".equals(name)) {
            try {
                byte[] bytes = Files.readAllBytes(Paths.get(PATH));
                return defineClass(PATH, bytes, 0, bytes.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.findClass(name);
    }
}