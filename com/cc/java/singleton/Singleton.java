package com.cc.java.singleton;


public class Singleton {

   // Objektbildung 
   private static  Singleton instance; 
   
   // feld, auf das Nach der objektbildung zugegriffen wird 
   private int counter;

    private Singleton(){

    }
     // .... in der Klasse
    public static  Singleton getInstance() {


       if (instance == null){
           instance = new Singleton();
       }
       return instance;   
       
       //return instance == null ? instance = new Singleton() : instance;
    }
    
    // Funktionalität im Objekt
    public int getCounter() {
      return counter;
  }

  public void actOnEvent() {
      this.counter ++;
  }


}
    
    
