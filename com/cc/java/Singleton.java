package com.cc.java;


public class Singleton {

   // Objektbildung 
   private static  Singleton instance; 

    private Singleton(){

    }

    public static  Singleton getInstance() {
      //  if (instance == null){
      //      instance = new Singleton();
       // }
       // return instance;   
       
       return instance == null ? instance = new Singleton() : instance;
    }
}
    
    
