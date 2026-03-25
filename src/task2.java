import java.util.Scanner;
class task2{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);

        if(ch>=48 && ch<=57){
            System.out.println("Number");
        } else if (ch==65 || ch==69 || ch==73 || ch==79 || ch== 85 || ch==97 || ch == 101 || ch==105 || ch==111 || ch==117) {
            System.out.println("Vowels");
        } else if ((ch>=66&&ch<=68)||(ch>=70&&ch<=72)||(ch>=80&&ch<=84)||(ch>=98&&ch<=100)||(ch>=106&&ch<=110)||(ch>=116)) {
            System.out.println("Consonants");
        }


    }
}