import java.util.Arrays;

public class LargestNumber {

    public void largestnumber(int[] arr,int  low, int high){

        int pivot=low;
       int  i=low;
        int j=high;
        while(i<j){

            while(arr[pivot] < arr[i] & i<j){

                pivot=i;
                i++;
            }
            i++;
        }
        if(arr[pivot] < arr[high]){
            arr[pivot]=arr[high];
        }

        System.out.println(arr[pivot]);


    }

    public static void main(String[] args) {
        int[] arr = {1,4,15,19, 2, 3, 5};
        int high=arr.length-1;
        LargestNumber L=new LargestNumber();
        L.largestnumber(arr,0,high);
    }
}
