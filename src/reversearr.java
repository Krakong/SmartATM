import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse Array: ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
