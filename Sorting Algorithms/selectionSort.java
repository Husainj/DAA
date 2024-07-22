
public class selectionSort {
    public static void main (String[] args) {

        int arr[] = {1,5,6,2,3,9};
        int size = 6;
     
        int temp;
        int minInd ;
        for(int j =0 ; j<size-1 ; j++){
            minInd = j;
            for(int k = j+1 ; k<size ; k++){
                if(arr[minInd] > arr[k]){
                    minInd = k;
                }
            }

            temp = arr[minInd];
            arr[minInd] = arr[j];
            arr[j] = temp;

        }

        for(int j =0 ; j<size ; j++){
            System.out.println(arr[j]);
        }

    }
}
