package com.linkcode.encapsultion;

public class Customer {
    private int accno;
    String name;
    long mobile;
    String address;
    private double balance;
    private String pass;

    public Customer(int accno, String name, long mobile, String address, double balance,String pass) {
        this.accno = accno;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.balance = balance;
        this.pass = pass;
    }

    public String getPass(){
        return this.pass;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double amount) {
        this.balance += amount;
    }



    public int getAccno() {
        return this.accno;
    }
    public void setAccno(int no) {
        this.accno = no;
    }

    public void displayInfo(){
        System.out.println("Account Number: " + this.accno);
        System.out.println("Name: " + this.name);
        System.out.println("Mobile Number: " + this.mobile);
        System.out.println("Address: " + this.address);
        System.out.println("Balance: " + this.balance);
    }

    public void withdraw(double amount){
        this.balance -= amount;
        System.out.println("Available balance: " + this.balance);
    }
}
