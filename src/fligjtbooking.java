import java.util.Scanner;

public class fligjtbooking {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        boolean flight[][]={new boolean[3],
                new boolean[4],
                new boolean[5]};
        int flag = 1;
        System.out.println("Welcome to Flight Seat Booking");
        while (flag ==1) {
            for (int i = 0; i < flight.length; i++) {
                System.out.print(i == 0 ? "Business (1-" + flight[i].length + "):" : (i == 1 ? "First (1-" + flight[i].length + "):" : "Economy (1-" + flight[i].length + "):"));

                for (int j = 0; j < flight[i].length; j++) {
                    System.out.print(" [" + (flight[i][j] ? "X" : " ") + "]");
                }
                System.out.println();
            }

            System.out.println("1.Business\n2.First\n3.Economy\n4.Exit");

            int row = sc.nextInt();
            if (row == 4) {
                System.out.println("Thank You.....");
                return;
            }

            if (row < 1 || row > 4) {
                System.out.println("Invalid row no.");
                continue;
            }
            System.out.println("Enter Seat number between(1-"+flight[row-1].length);
            int col=sc.nextInt();

            flight[row-1][col-1]=true;
        }

    }
}
