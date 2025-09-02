public class RecursiveInsertionSort {

    public void recursiveinsertionsort(int[] arr, int low, int high) {

        //13,46,24,52,20,9

      int j=low;
      int n=high;

        if(low>high){
            return;
        }
        while( j>0){

            if(arr[j-1]>arr[j]){
                int temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j] =temp;
            }
            j--;
        }

        low++;

        recursiveinsertionsort(arr,low,high);


    }

}
