package com.linkcode.encapsultion;

import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    static Customer cust1;
    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            System.out.println("---Welcome to Bank---");
            System.out.println("1. Create new account");
            System.out.println("2. Check Balance");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1->{
                    System.out.println("Enter Your Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter Your Mobile Number: ");
                    long mobile = sc.nextLong();
                    System.out.println("Enter Your Address: ");
                    sc.nextLine();
                    String address = sc.nextLine();
                    System.out.println("Enter Your Balance: ");
                    double balance = sc.nextDouble();
                    int accno = ((int)(Math.random()*1000));
                    System.out.println("Account Number: "+accno);
                    System.out.println("Enter Your Password: ");
                    String pass = sc.next();
                    cust1 = new Customer(accno, name, mobile, address, balance,pass);
                }
                case 2->{
                    System.out.println("Available Balance: "+cust1.getBalance());
                }
                case 3->{
                    System.out.println("Enter Your Account Number: ");
                    int accno = sc.nextInt();
                    System.out.println("Enter Password: ");
                    String pass = sc.next();

                    if(accno ==cust1.getAccno()&&pass.equals(cust1.getPass())) {
                        System.out.println("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        if(cust1.getBalance()>=amount) {
                            cust1.withdraw(amount);
                        }
                        else{
                            System.out.println("Insufficient funds!");
                        }
                    }else
                    {
                        System.out.println("Invalid Credentials");
                    }
                }
                case 4->{}
                case 5->flag=false;
            }
        }




    }
}
