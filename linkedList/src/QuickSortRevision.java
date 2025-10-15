import java.util.Arrays;

public class QuickSortRevision {

    public void quickSort(int[] arr, int low, int high){

        if(low < high){

            int partitionIndex= partition(arr,low, high);

            quickSort(arr,low, partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public int partition(int[] arr, int low, int high)
    {
        int index=low-1;

        for(int i=low;i<high;i++){

            if(arr[i] < arr[high]){
                index++;
                swap(index, i,arr);


            }
        }
        index++;
        swap(index, high,arr);
        return index;

    }

    public void swap( int index, int i, int[] arr){
        int temp = arr[index];
        arr[index] =arr[i];
        arr[i] = temp;

    }

    public static void main(String[] args) {
        QuickSortRevision qs= new QuickSortRevision();
        int [] arr= {2,3,7,4,1,5,1,99,23};
        int n=arr.length;
        int low=0;
        int high=n-1;
        qs.quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

}
