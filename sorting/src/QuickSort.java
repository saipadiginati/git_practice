import java.util.Arrays;

public class QuickSort
{

    public void  quickSort(int[] arr, int low, int high){

        if(low<high)
        {
            int pivot= arr[low];
            int partionIndex = partion(arr,low, high);
            quickSort(arr,low,partionIndex-1);
            quickSort(arr,partionIndex+1,high);

        }

    }

    private int partion(int[] arr, int low, int high) {

        int i=low;
        int j=high;
        int pivot= arr[low];
        while(i<j) {

            while (arr[low] > arr[i] & i <= high) {
                i++;

            }
            while (arr[low] < arr[j]) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
                int temp=arr[j];
                arr[j]=arr[low];
                arr[low]=temp;

        return j;
    }

    public static void main(String[] args) {
        int[] arr= {4,1,7,9,3};
        int high=arr.length-1;
        QuickSort q1=new QuickSort();
        q1.quickSort(arr,0,high);
        System.out.println(Arrays.toString(arr));
    }
}
