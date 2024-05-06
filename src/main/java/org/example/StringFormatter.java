package org.example;

public class StringFormatter {

    String input = "java";

    public String toNameFormat (String input) {


        String cap = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        System.out.println(cap);

        return cap;
    }
}
