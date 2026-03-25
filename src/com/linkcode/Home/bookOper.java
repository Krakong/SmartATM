package com.linkcode.Home;

import java.util.Scanner;

public class bookOper {

    static Scanner sc = new Scanner(System.in);
    static bookmanagement books[]=new bookmanagement[50];
    static int count;

    static{
        books[count++]=new bookmanagement("Harry Potter","JK Rowling",100,300);
        books[count++]=new bookmanagement("Angels And Demons","Dan Brown",349,999);
        books[count++]=new bookmanagement("Da Vinvi Code","Dan Brown",444,1129);
            }

    public static void main(String[]args){
        boolean flag=true;
        while(flag){
            System.out.println("Book Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Update Book Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1->addbook();
                case 2->displayBook();
                case 3->FindBook();
                case 4->DeleteBook();
                case 5->UpdateBook();
                case 6->flag=false;
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void UpdateBook() {
        System.out.println("Enter Book Name to Update: ");
        sc.nextLine();
        String bookName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (bookName.equalsIgnoreCase(books[i].bookName)) {
                found = true;

                System.out.println("Book Found!");
                System.out.println("What do you want to update?");
                System.out.println("1. Book Name");
                System.out.println("2. Author");
                System.out.println("3. Price");
                System.out.println("4. Pages");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter New Book Name: ");
                        books[i].bookName = sc.nextLine();
                    }
                    case 2 -> {
                        System.out.print("Enter New Author Name: ");
                        books[i].author = sc.nextLine();
                    }
                    case 3 -> {
                        System.out.print("Enter New Price: ");
                        books[i].price = sc.nextInt();
                    }
                    case 4 -> {
                        System.out.print("Enter New No. of Pages: ");
                        books[i].pages = sc.nextInt();
                    }
                    default -> System.out.println("Invalid choice");
                }

                System.out.println("Book Updated Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found");
        }
    }


    private static void DeleteBook() {
    }

    private static void FindBook() {
        System.out.println("Enter Book Name: ");
        sc.nextLine();
        String bookName = sc.nextLine();
        boolean flag=true;
        for(int i=0;i<count;i++){
            if (bookName.equalsIgnoreCase(books[i].bookName)){
                System.out.println("book Found");
                flag=false;
                System.out.println("--------------------");
                books[i].displayInfo();
                System.out.println("---------------------");
            }
        }
        if(flag){
            System.out.println("book Not Found");
        }
    }

    private static void displayBook() {
        System.out.println("Book Details");
        System.out.println("-----------------------");
        for(int i=0;i<count;i++){
            books[i].displayInfo();
            System.out.println("-----------------------");
        }
    }

    private static void addbook() {
        System.out.println("Enter Book Name: ");
        sc.nextLine();
        String bookName = sc.nextLine();
        System.out.println("Enter Book Author: ");
        String bookAuthor = sc.nextLine();
        System.out.println("Enter Book Price: ");
        int bookPrice = sc.nextInt();
        System.out.println("Enter No. of Pages: ");
        int bookPages = sc.nextInt();

        books[count++]=new bookmanagement(bookName,bookAuthor,bookPrice,bookPages);
    }

}
