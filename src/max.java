import java.util.Scanner;

public class max {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the Values of array: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Max: "+max);
    }
}
