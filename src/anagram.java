import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st word: ");
        String str1 = sc.next();
        System.out.println("Enter 2nd Word: ");
        String str2 = sc.next();

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean flag = true;
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
