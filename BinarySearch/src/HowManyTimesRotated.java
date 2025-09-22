import java.util.ArrayList;

public class HowManyTimesRotated {

    public int rotate(ArrayList<Integer> nums){
        int n=nums.size();
        int low=0;
        int high=n-1;
        int count=0;
        int minimum=Integer.MAX_VALUE;


        while(low<= high){

            int mid=(low+high)/2;

//left sorted [5,6,0,1,2,3,4]  //[4, 5, 6, 7, 0, 1, 2, 3]  0,1,2,3

            if(nums.get(low) < nums.get(mid)){
                minimum=Math.min(minimum,nums.get(low));
                count=low+1;
                low=mid+1;
            }
            else
            {
                minimum=Math.min(minimum,nums.get(mid));
                count=mid+1;
                high=mid-1;

            }

        }
        return count;
    }
}
