public class MinimumRotatedSortedArray {

    public int minimumRotated(int [] arr){
        int n= arr.length;

        int low=0;
        int high=n-1;
        int minimum=Integer.MAX_VALUE;
        while(low<=high){

            int mid=(low+high)/2;
            //left sorted

            if(arr[low] <= arr[mid]){

                minimum= Math.min(minimum, arr[low]);
                low=mid+1;

            }

            else{
                minimum= Math.min(minimum, arr[mid]);
                high=mid-1;
            }
        }
        return minimum;
    }
}
