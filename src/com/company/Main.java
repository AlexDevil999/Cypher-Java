package com.company;

import com.company.aes.CypherAes;
import com.company.cypherCesary.CypherCesary;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {

        String string = "Hello World!";
        int key = 2;

        CypherCesary res = new CypherCesary(string,key);
        CypherAes cypherAes = new CypherAes(string);
        System.out.println(res.get());
        System.out.println(cypherAes.encrypt());
        System.out.println(cypherAes.decrypt());


    }
}
