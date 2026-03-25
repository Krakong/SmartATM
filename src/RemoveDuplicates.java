import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[]args) {
        int arr[] = {2, 2, 3, 2, 3, 2, 1, 3, 3, 4};

//        int temp[]=new int[arr.length];
//        int uniqueCount=0;
//
//        for(int i=0;i<arr.length;i++){
//            boolean flag = false;
//
//            for(int j=0;j<uniqueCount;j++){
//                if(arr[i]==temp[j]){
//                    flag=true;
//                    break;
//                }
//            }
//            if(!flag){
//                temp[uniqueCount++]=arr[i];
//            }
//
//            int remove[]= Arrays.copyOf(temp,uniqueCount);
//            System.out.println(Arrays.toString(remove));


        //inbuilt function

        int remove1[] = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(remove1));


        }
    }

