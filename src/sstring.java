import java.util.Scanner;

public class sstring {



        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
//        String nig = "Hola Amigos";
//        String niga = "Hola Amigos";
//
//        System.out.println(niga == nig);
//        System.out.println(nig.equals(niga));

////Inbuilt methods
//        String nig = new String("Hola Amigos");
//        String niga = new String("Hola Amigos");
//
//        System.out.println(niga == nig);
//        System.out.println(nig.equals(niga));


////        User input strings
//        System.out.println("Welcome to string comparer");
//
//        System.out.println("Palindrome");
//        System.out.println("Please enter the first string:");
//        String nig = sc.next();
//        String niga = new String("");
//
//        for (int i = nig.length()-1; i>=0 ; i--){
//            niga = niga + nig.charAt(i);
//        }
//        System.out.println(niga);
//        if(nig .equals (niga)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("NOT Palindrome");
//        }


////        User input strings ----------------------------INCOMPLETE
//        System.out.println("Welcome to string comparer");
//
//        System.out.println("Palindrome");
//        System.out.println("Please enter the first string:");
//        StringBuffer mon =new StringBuffer(sc.next());
//        StringBuffer monk = new StringBuffer("");
//
//        for (int i = mon.length()-1; i>=0 ; i--){
//            monk = mon+mon.charAt(i);
//        }
//        System.out.println(monk);
//        if(mon .equals (monk)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("NOT Palindrome");
//        }

//   VOWELS IN A STRING
            System.out.println("VOWELS IN STRING");
            System.out.println("Please enter the first string:");
            String nig = sc.next();
            String niga = new String("");
            String nigb = new String("");
            int vow = 0;
            int conso =0;

            for (int i = nig.length()-1; i>=0 ; i--){
                if(nig.charAt(i)=='a' || nig.charAt(i)=='e' || nig.charAt(i)=='i' || nig.charAt(i)=='o' || nig.charAt(i)=='u' ||
                        nig.charAt(i)=='A' || nig.charAt(i)=='E' || nig.charAt(i)=='I' || nig.charAt(i)=='O' || nig.charAt(i)=='U') {
                    niga = nig.charAt(i) + niga ;
                    vow++;
                }else{
                    nigb = nig.charAt(i) + nigb;
                    conso++;
                }

            }
            System.out.println("Vowels persent:"+vow+": "+niga);
            System.out.println("Consonents persent:"+conso+": "+nigb);
        }
    }


