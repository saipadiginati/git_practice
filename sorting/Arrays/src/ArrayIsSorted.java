public class ArrayIsSorted {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length-1;
        int didSwap=0;
        for(int i=0;i<=n;i++){

            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                didSwap++;
            }
            j--;

        }

        if(didSwap == 0){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
