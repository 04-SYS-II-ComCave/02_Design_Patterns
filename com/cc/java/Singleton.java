package com.cc.java;


public class Singleton {

   // Objektbildung 
   private static  Singleton instance; 

    private Singleton(){

    }

    public static  Singleton getInstance() {
        return instance;
    }
    
    
}
