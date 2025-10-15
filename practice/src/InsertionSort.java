import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] arr){

        int n= arr.length;

        //13,46,21,52,20,9

        for(int i=0;i<n;i++){

            for(int j=i;j<n-1;j++){

                if(arr[j] >arr[j+1]){
                    swap(j,j+1,arr);
                    while(j>0){
                        if(arr[j] < arr[j-1]){
                            swap(j,j-1,arr);
                        }
                        j--;
                    }
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

        int[] arr={2,3,7,4,1,5,1,99,23};
        InsertionSort bs= new InsertionSort();
        bs.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
