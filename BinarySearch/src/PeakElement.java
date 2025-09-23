public class PeakElement {

    public int peak(int[] arr){

        int n=arr.length;
        int low=1;
        //int start;
        int high=n-2;

        while(low<=high){

            int mid= low + (high-low) /2;

            if(arr[mid] >arr[mid-1] && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid] > arr[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

}
