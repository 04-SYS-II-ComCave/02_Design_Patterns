package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Singleton singleton1 = new Singleton();
    output("obj1" + singleton1);

    Singleton singleton2 = new Singleton();
    output("obj1" + singleton2);
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

