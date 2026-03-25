package com.linkcode.com.linkcode.Has;

public class Bike {
    int cno;
    String bname;
    int cc;
    Engine engine;

    public Bike(int cno, String bname, int cc, Engine engine) {
        this.cno = cno;
        this.bname = bname;
        this.cc = cc;
        this.engine = engine;
    }

    public void display() {
        System.out.println("Bike Name: " + bname);
        System.out.println("Bike CC: " + cc);
        System.out.println("Engine Details: "+engine.engineno+","+engine.power+","+engine.type);
    }

}
