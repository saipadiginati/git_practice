public class InsertionSort {

    public void insertionSort(int[] arr){
        int n=arr.length;
int didswap=0;
        for(int i=0 ;i<=n-1;i++)

        {
            int j=i;
            while(j>0){

                if(arr[j-1]>arr[j]){
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] =temp;
                    didswap+=1;

                }
                j--;
            }

        }
        if(didswap==0){
           return;

        }
    }
}
