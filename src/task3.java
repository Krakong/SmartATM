import java.util.Scanner;
class task3{

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter THe Units: ");
        int units = sc.nextInt();

        if(units<=100){
            System.out.println("The Amount is "+units*2);
        }
        else if(units >100 && units<=200){
            int nunits = (units-100)*3+200;
            System.out.println("The Amount is: "+nunits);
        }
        else if(units >200){
            int nunits = (units-200)*5+500;
            System.out.println("The Amount is: "+nunits);

        }
    }
}