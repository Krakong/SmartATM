import java.util.Scanner;

public class arrOper {

    public static void Insert(){

    }
    public static void Update(){

    }
    public static void Delete(){

    }

    public static void Display(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[]={11,22,44,33,55,66,45,77,88,99,111};
        System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display\n5.Exit");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1->Insert();
            case 2->Update();
            case 3->Delete();
            case 4->Display(arr);
            default -> System.out.println("Invalid Choice!");
        }

    }
}
