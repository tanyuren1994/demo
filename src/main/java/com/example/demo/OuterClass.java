package com.example.demo;

public class OuterClass {
    private String outerField = "Hello";

    final class InnerClass {
        private String innerField = "World";
        void printHello() { System.out.println(outerField); }
        void printWorld() { System.out.println(innerField);
        }
    }
}

