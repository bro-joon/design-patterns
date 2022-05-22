package com.boksil2.templatemethod;

import java.io.File;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
