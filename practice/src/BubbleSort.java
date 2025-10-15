import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] arr){

        int n= arr.length;
        //arr= 2,3,7,1,4
        // loop
        for(int i=n-1;i >= 1; i--){
           // int mini=i;
            for(int j=0;j< i;j++){

                if(arr[j] >arr[j+1]){
                    swap(j,j+1,arr);

                }


            }
        }
    }

    public void swap(int i, int j, int[] arr){
         int temp=arr[i];
         arr[i] =arr[j];
         arr[j]= temp;
    }

    public static void main(String[] args) {

        int[] arr={2,3,7,4,1,5,0};
        BubbleSort bs= new BubbleSort();
        bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
