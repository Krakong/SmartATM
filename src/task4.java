import java.util.Scanner;
class task4{

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter 1st number: ");
        float first = sc.nextFloat();
        System.out.println("ENter 2nd number: ");
        float second = sc.nextFloat();
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");

        int flag = 1;

        while (flag!=0) {
            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1->
                    System.out.println(first + second);

                case 2->
                    System.out.println(first - second);

                case 3->
                    System.out.println(first * second);

                case 4->{
                    if (first == 0 || second == 0){
                        System.out.println("Number Cannot be divided by 0");
                    }
                    else{
                        System.out.println(first / second);
                    }

                }

                case 5->{
                    System.out.println("Wow Niceeee Chiiii");
                    flag = 0;
                }

                default ->
                    System.out.println("Invalid CHoice");

            }
        }




    }
}