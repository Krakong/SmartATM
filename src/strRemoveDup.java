import java.util.Scanner;

public class strRemoveDup {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();

        String remove = "";

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(remove.indexOf(ch)==-1){
                remove+=ch;
            }
        }
        System.out.println(remove);

    }
}
