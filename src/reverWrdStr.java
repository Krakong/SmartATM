import java.util.Arrays;
import java.util.Scanner;

public class reverWrdStr {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String word[]=str.split(" ");
        String rev = "";


        for(String reverse:word) {
            for (int j = reverse.length()-1;j>=0; j--){
                rev += reverse.charAt(j);
            }
            rev+=" ";
        }
        System.out.println("Reversed Words: "+rev);
    }
}
