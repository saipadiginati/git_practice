public class RecursiveBubbleSort {

    public void recursiveBubbleSort(int[] arr, int low, int high){

        //2,4,1,3,5

        int pointer=low;
        int i=low+1;
        int j=high;
        if(low >=high){
            return;
        }


        while(pointer<=j)
        {
            if(arr[pointer] > arr[i])
            {
                swap(arr,pointer,i);

                pointer++;
                if(pointer>=j){
                    break;
                }
                i++;

            }
            else {
                pointer++;
                if(pointer>=j){
                    break;
                }
                i++;
            }
        }
        j--;
        recursiveBubbleSort(arr, 0,j--);


    }

    public void swap(int[] arr,int pointer, int i)
    {
        int temp=arr[pointer];
         arr[pointer]=arr[i];
        arr[i]= temp;
    }
}
