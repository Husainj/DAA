import java.util.*;

public class BinarySearch{

    public static int Binary(int arr[] , int n , int key ){
        int start =0 ;
        int end = n-1;

        int mid = start + (end-start)/2;

        while (start<=end){
            if(arr[mid] == key){
                return mid;
            }
            else if( arr[mid] > key ){
                end = mid -1;
            }
            else{
                start = mid +1;
            }

            mid = start + (end-start)/2;
        }

        return 0;

        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int i;
        int arr[] = new int[size] ;
        System.out.println("Enter Array elements : ");
        for(i=0 ; i<size ; i++){
            System.out.println("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key you want to find : ");
        int key = sc.nextInt();
       int ans =  Binary(arr, size, key);

       System.out.println("Your key is at index :"+ans);

        
    }
}