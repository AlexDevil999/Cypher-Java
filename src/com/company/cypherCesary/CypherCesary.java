package com.company.cypherCesary;

public class CypherCesary {

    private String word;
    private char[] chars;
    private int key;

    public CypherCesary(String string,int key){
        this.word = string;
        this.chars = new char[string.length()];
        this.key = key;
    }

    public char[] get(){

        for (int i = 0;i<this.word.length();i++){
            this.chars[i] = (char)((int)(this.word.charAt(i)) + this.key);
        }
        return this.chars;
    }


}
