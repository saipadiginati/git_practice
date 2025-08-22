import java.util.Arrays;

public class SelectionSort {

    //[1,4,3,2,8,6,5,4]

    public void selectionSort(int[] arr)
    {
        int pointer=0;
        int low=0;

        int j=arr.length-1;
        while(low<j)
        {
            int i=low+1;

           while(i<=j){
               if( arr[pointer] > arr[i] ) {

                   swap(arr, pointer,i);
               }
               else{
                   i++;
               }

           }
          low= low+1;
          pointer= pointer+1;

        }
    }

    public void swap(int[] arr,int pointer, int i){

        int temp= arr[pointer];
        arr[pointer]= arr[i] ;
        arr[i]=temp;

    }

//    public void sort_by_selection(int[] arr)
//
//    {
//        int n= arr.length;
//        int temp=0;
//      for(int i=0;i< n-1;i++)  //n times
//
//      {
//          for(int j=i+1;j<=n-1;j++)  // n-1, n-2,n-3,n-4 ....1 (n*(n+1)2)
//          {
//           if(arr[j] < arr[i]){  //[2,4,6,1,3,5]
//               temp =arr[i];  //2
//               arr[i] = arr[j];  //1
//               arr[j]= temp; //2
//           }
//          }
//
//          //time compelxity is  O(N*N) --
//
//      }
//
//    }

    public static void main(String[] args) {


        int[] arr ={ 13,46,24,52,20,9};
        SelectionSort s1= new SelectionSort();
        s1.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
