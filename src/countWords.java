import java.util.Scanner;

public class countWords {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String count[]=str.split(" ");
        System.out.println("Count: "+count.length);


    }
}
