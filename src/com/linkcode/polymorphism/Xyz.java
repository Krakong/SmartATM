package com.linkcode.polymorphism;

public class Xyz {
    public static void main(String[] args) {
//        Dell dell = new Dell();
//        dell.coding();
//        dell.gaming();
//        dell.work();
//        Laptop laptop = dell;
//        laptop.coding();
//        laptop.work();
//        Device device = laptop;
//        device.work();

        Device device = new Dell();
        device.work();
        Laptop laptop = (Laptop) device;
        laptop.work();
        laptop.coding();
        Dell dell = (Dell) laptop;
        dell.work();
        dell.coding();
        dell.gaming();
    }
}
