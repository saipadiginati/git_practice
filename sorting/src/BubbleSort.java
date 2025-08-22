public class BubbleSort {

    public void bubbleSort(int[] arr){
        //3,2,1,4
       int high= arr.length-1;
        for(int i= high; i >= 1; i--){
            int nextvalue=1;
            int low=0;
            while(low<= i){

                if(arr[low] >arr[nextvalue] ){
                    swap(low, nextvalue, arr);
                    low++;
                    if(low >=i){
                        break;
                    }
                    nextvalue++;

                }
                else{
                    low++;
                    nextvalue++;

                }
            }
        }
    }

//        int n= arr.length;
//        //[1,3,5,2,4,6]
//        for(int i=n-1;i >= 1;i--){
//
//            for(int j=0;j<i;j++){
//                if(arr[j]>arr[j+1]) // 2>1
//                {
//                    swap(j,j+1, arr);
//                }
//            }
//        }
//
//    }

    public void swap(int first, int second, int[] swaparr){
        int temp = swaparr[first];
         swaparr[first] = swaparr[second] ;
        swaparr[second]= temp;

    }
}
