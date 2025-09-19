public class LowerBound {

    public void lowerBound(int[] arr,int target)
    {
        int n=arr.length;  //1,2,3,4,5
        int max=n;
        int low=0;
        int high=n-1;

        while(low <= high){

            int mid= (low+high)/2;

            if(arr[mid] > target) {
                max = mid;
                high = mid - 1;
            }
            else {
                low= mid+1;
            }
        }
        System.out.println("lower bound is " + max);
    }
}
