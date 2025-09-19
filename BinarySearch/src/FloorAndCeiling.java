public class FloorAndCeiling {

    public void floor(int [] arr,int target){

        int n=arr.length;
        int low=0;
        int high=n-1;
        int index=n;  //1,1,2,3,4,5,7,8,9

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid] <=target){
                index=mid;
                //high=mid-1;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        System.out.println(arr[index] + "is largest number that is smaller than " + target);


    }

    public void ceiling(int [] arr, int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int index=n;  //1,1,2,3,4,5,7,8,9

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid] >=target){
                index=mid;
                high=mid-1;


            }
            else{
                low=mid+1;
            }
        }
        System.out.println(arr[index] + "is smallest number that is greater than " + target);

    }


}
