package bsOnAnswers;

public class SmallestDiviisorUsingBS {

    public int sd(int[] arr, int limit){

        int n=arr.length;
        int low=0;
        int high=44;
        int num=1;
        int result=-1;
        while(low<=high){

            int sum=0;
            int mid=low + (high-low)/2;

            if(mid == 0){
                return result;
            }

            for(int j=0; j<n;j++){
                sum=sum+ (Math.ceilDivExact(arr[j], mid));
            }
            if(sum <= limit){
                result=mid;
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
}
