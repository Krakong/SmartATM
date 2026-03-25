import java.util.Scanner;
class task{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String username = "admin";
        String password = "admin@123";

        System.out.println("Enter Username");
        String uname = sc.nextLine();
        System.out.println("Enter Password");
        String upass = sc.nextLine();

        if(username.equals(uname) && password.equals(upass)){
            System.out.println("Login Successful");
        } else if (!username.equals(uname) || !password.equals(upass)) {
            System.out.println("Invalid Credentials");
            
        }


    }
}