package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        StringFormatter stringFormatter = new StringFormatter();

        System.out.println("Current JVM version -" + System.getProperty("java.version"));

        stringFormatter.toNameFormat("TEsEloILHnt");
    }
}