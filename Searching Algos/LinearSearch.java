import java.util.Scanner;

public class LinearSearch {

    public static int linear(int arr[] , int n , int key){
        int i;
        for(i = 0 ; i< n ; i++){
            if(arr[i] == key){
                return i;
            }
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

        int ans = linear(arr , size , key);

        System.out.println("Your key is at index :" + ans);




    }
}
