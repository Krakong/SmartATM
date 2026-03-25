import java.util.*;
class loop{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the Values of array: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Values From Array: ");
        for (int a:arr){
            System.out.println(a);
        }
    }
}