import java.util.Scanner;

public class countevenarr {
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
        for (int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Total even no.s in array: "+count);
    }
}