public class CountOccurance {

    public void count(int [] arr, int target){

        int n= arr.length;
        int low=0;
        int high=n-1;

        int lowindex=-1;  //{2, 2 , 3 , 3 , 3 , 3 , 4}


        while(low<=high){

            int mid=(low+high)/2;

            if(arr[mid] == target){
                lowindex=mid;
                high=mid-1;

            }

            else if(arr[mid] > target){
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }

        int i=lowindex+1;
        int j=n-1;
        int count=1;

        while(i<=j  & lowindex != -1){
            int mid=(i+j)/2;

            if(arr[mid] ==target){
                count++;
            }
            if(arr[mid] >target){
               j=mid-1;
            }
            else{
                break;
            }
        }

        if(lowindex == -1) {
            System.out.println("count is zero");
        }

            else{
                System.out.println(count);
            }

    }
}
