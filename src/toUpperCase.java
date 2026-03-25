import java.util.Scanner;

public class toUpperCase {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String vecna = sc.nextLine();

        char el[] = vecna.toCharArray();

        for (int i = 0; i < el.length; i++) {
            if (el[i] >= 'a' && el[i] <= 'z') {
                el[i] = (char) (el[i] - 32);
            }


        }System.out.println(el);
    }
}

