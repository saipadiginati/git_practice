import java.util.Arrays;

public class SelectionSort {

    public void sort_by_selection(int[] arr)

    {
        int n= arr.length;
        int temp=0;
      for(int i=0;i< n-1;i++)  //n times

      {
          for(int j=i+1;j<=n-1;j++)  // n-1, n-2,n-3,n-4 ....1 (n*(n+1)2)
          {
           if(arr[j] < arr[i]){  //[2,4,6,1,3,5]
               temp =arr[i];  //2
               arr[i] = arr[j];  //1
               arr[j]= temp; //2
           }
          }

          //time compelxity is  O(N*N) --

      }

    }

    public static void main(String[] args) {


        int[] arr ={ 13,46,24,52,20,9};
        SelectionSort s1= new SelectionSort();
        s1.sort_by_selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
