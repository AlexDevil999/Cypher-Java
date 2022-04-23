package com.company;

import com.company.cypherCesary.CypherCesary;

public class Main {

    public static void main(String[] args) {

        String string = "Hello World!";
        int key = 2;

        CypherCesary res = new CypherCesary(string,key);
        System.out.println(res.get());

    }
}
