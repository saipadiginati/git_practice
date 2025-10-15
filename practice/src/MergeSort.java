import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    // 2,3,7,4,1,5,1,99,23



    public void mergeSort(int[] arr, int low, int high)
    {


        if(low>= high) {
            return;
        }
        int mid= (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low, mid,high);

    }

    public void merge(int[] arr, int low, int mid, int high) {

        /*2,3,7,4,1,5,1,99,23
         *2,3,7,4,1 - one part
         * 5,1,99,23 - second part
        two pointers on each set
        * left =low;
        * right= mid+1;

         */
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while ((left <= mid) && (right <= high)) {

            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right <=high) {
            temp.add(arr[right]);
            right++;
        }
//        int i=0;
//        for(int num:temp) {
//            arr[i] = num;
//            i++;
//        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low); // adjust index
        }
        System.out.println(temp);

        }
    public static void main(String[] args) {

        int[] arr={2,3,7,4,1,5,1,99,23};
       int n=arr.length;
       int low=0;
       int high=n-1;
        MergeSort ms= new MergeSort();
        ms.mergeSort(arr, low,high);
        System.out.println(Arrays.toString(arr));
    }

    }

