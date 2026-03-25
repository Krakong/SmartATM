import java.util.Scanner;

public class sumarr {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Values: ");
        for(int i =0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

            sum = sum+arr[i];


        }
        System.out.println("The Sum of all Elements in the array is: "+sum);
    }
}
