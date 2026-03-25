package Java;
import java.util.Scanner;

public class max {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        

        System.out.println(num1>num2?num1:num2);
        sc.close();


    }
    
}
