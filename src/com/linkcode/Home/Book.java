package com.linkcode.Home;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Book Management System");
        System.out.println("How Many books you want to add?");
        int n = sc.nextInt();

        bookmanagement arr[]= new bookmanagement[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter Book Details");
            System.out.println("Enter Book Name: ");
            String name = sc.next();
            System.out.println("Enter Book Author: ");
            String author = sc.next();
            System.out.println("Enter Book Price: ");
            int price = sc.nextInt();
            System.out.println("Enter Book Pages: ");
            int pages = sc.nextInt();

            arr[i]= new bookmanagement(name,author,price,pages);
        }
        System.out.println("Book details added successfully");

        for(bookmanagement obj:arr){
            obj.displayInfo();
        }
    }
}

