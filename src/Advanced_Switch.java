import java.util.Scanner;


class Advanced_Switch{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int flag = 1;


        while(flag!=0){
            System.out.println("Enter Month Number: ");
            int month = sc.nextInt();
            String result = switch (month){

                case 1->"Jan";
                case 2->"Feb";
                case 3->"March";
                case 4->"April";
                case 5->"May";
                case 6->"June";
                case 7->"July";
                case 8->"Aug";
                case 9->"Sept";
                case 10->"Oct";
                case 11->"Nov";
                case 12->"Dec";
                default -> "Invalid Month number";



            };
            System.out.println(result);
        }


    }
}