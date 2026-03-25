import java.util.Scanner;

public class jagged {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter Number of Rows: ");
        int row=sc.nextInt();
        int jagged[][]=new int[row][];

        for(int i =0;i<row;i++){
            System.out.println("Enter col no for row no"+(i+1));
            jagged[i]=new int[sc.nextInt()];
            System.out.println("Enter values for row now: ");
            for (int j =0;j<jagged[i].length;j++){
                jagged[i][j]=sc.nextInt();
            }
        }

        System.out.println("Values From Array: ");

        for (int i=0;i<jagged.length;i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print (jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
