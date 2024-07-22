
public class bubbleSort {
    public static void main(String[] args) {
        
        int arr[] = {1,5,6,2,3,9};
        int size = 6;
        int i=0;
        int temp;
        while(i<size){
            for(int j=0 ; j<size-1 ; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            i++;
        }

        for(int j =0 ; j<size ; j++){
            System.out.println(arr[j]);
        }

    }

    
}
