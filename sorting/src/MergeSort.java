import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public void divideArray(int[] arr, int low, int high){

        int mid=(low+high)/2;
        if(low>=high){
            return;
        }

        divideArray(arr,low,mid);
        divideArray(arr,mid+1,high);
        merge(arr , low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high)
    {
       int left=low;
       int right= mid+1;
        ArrayList<Integer> temp= new ArrayList<>();
       while(left<=mid && right<=high){

           if(arr[left]<=arr[right]){
               temp.add(arr[left]);
               left++;
           }
           else
           {
           temp.add(arr[right]);
           right++;
           }
       }

//       for(int i=left; i<mid;i++){
//           temp.add(arr[i]);
//       }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
       int[] arr={7,1,9,5,4} ;
       int low=0;
       int high= arr.length-1;
        MergeSort s1= new MergeSort();
        s1.divideArray(arr,low, high);
        System.out.println(Arrays.toString(arr));

    }
}


