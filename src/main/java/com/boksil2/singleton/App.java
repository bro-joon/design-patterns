package com.boksil2.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings = Settings.getInstance();

        Settings settings1 = Settings.getInstance();

        System.out.println(settings == settings1);
    }
}
