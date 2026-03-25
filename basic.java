package Java;
import java.util.Scanner;

class basic {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Name: "+name);
        System.out.println(age>=18?"Eligible to vote":"Not eligible to vote");
        sc.close();

    }
    
}
