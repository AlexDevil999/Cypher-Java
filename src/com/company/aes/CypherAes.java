package com.company.aes;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CypherAes {

    private String string;
    private byte[] bytes;
    private SecretKey secretKey;

    public CypherAes(String string){
        this.string = string;
    }

    public String encrypt() throws NoSuchPaddingException,
            NoSuchAlgorithmException,
            InvalidKeyException,
            IllegalBlockSizeException,
            BadPaddingException {
        String res = "";
        Cipher cipher = Cipher.getInstance("AES");
        this.secretKey = generator();
        cipher.init(Cipher.ENCRYPT_MODE,this.secretKey);
        this.bytes = cipher.doFinal(this.string.getBytes());

        for (int i = 0; i < this.bytes.length; i++) {
            res+=this.bytes[i];
        }
        return res;
    }

    public String decrypt() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        String res = "";
        Cipher decCipher = Cipher.getInstance("AES");
        decCipher.init(Cipher.DECRYPT_MODE,this.secretKey);
        byte[] decBytes = decCipher.doFinal(this.bytes);
        for (int i = 0; i < decBytes.length; i++) {
            res+=(char)decBytes[i];
        }
        return res;
    }

    private SecretKey generator() throws NoSuchAlgorithmException {
        KeyGenerator kgey = KeyGenerator.getInstance("AES");
        kgey.init(128);
        return kgey.generateKey();
    }

}
