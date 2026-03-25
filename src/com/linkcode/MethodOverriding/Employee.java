package com.linkcode.MethodOverriding;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String address;

    public Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void display() {
        System.out.println("Name:"+this.name);
        System.out.println("Salary:"+this.salary);
        System.out.println("Address:"+this.address);
    }

    public String toString() {
        return this.address;
    }

    public int hashCode() {
        return this.id;
    }
    public boolean equals(Object obj) {
        return this.name == (((Employee)obj).name);
    }
}
