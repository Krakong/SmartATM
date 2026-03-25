import java.util.Arrays;
import java.util.Scanner;

public class methods {

    public static String searchh(int arr[],int key){
        Scanner sc = new Scanner(System.in);



        int start =0;
        int end = arr.length;
        Arrays.sort(arr);
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return "Key found at: "+mid;

            }
            else if (arr[mid]>key){
                end = mid-1;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }

        }
        return "Key not found";


        }



    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {11, 22, 44, 55, 15};
        System.out.println("Enter the key to find: ");
        int key = sc.nextInt();

        System.out.println(searchh(arr,key));

    }


    }


