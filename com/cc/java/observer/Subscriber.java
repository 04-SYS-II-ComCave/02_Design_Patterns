package com.cc.java.observer;

import com.cc.java.tools.Helper;

public class Subscriber extends Observer{

   private Subject s;
   private String name;



    public Subscriber(Subject s, String name){
          this.s = s;
          this.name = name;
          s.attach(this);
    }


    @Override
    public void update() {
       String str = name + ": observers, that subject changed  its start" ;
       Helper.output(str);
    }

    
}
