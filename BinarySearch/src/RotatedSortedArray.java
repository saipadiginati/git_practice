public class RotatedSortedArray {

    public int rs(int[] arr, int target){

        int n=arr.length;
        //6,7,0,1,2,3,4,5

        int low=0;
        int high=n-1;

        while(low<= high){

            int mid=(low+high)/2;

            if(arr[mid] == target){
                return mid;
            }
            //left stored
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && arr[mid] >= target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
            //right array is sorted.
            else{

                 if(arr[mid] <= target && arr[high] >= target ){
                     low= mid+1;
                 }
                 else{
                     high =mid-1;
                 }
            }




        }
        return -1;

    }
}
