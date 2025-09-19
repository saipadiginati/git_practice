import java.util.ArrayList;

public class InsertionPosition {

    public void ip (int [] arr,int  target){


        int n=arr.length;

        ArrayList<Integer> array=new ArrayList<>();

        for(int i : arr){
            array.add(i);
        }

        //[1,2,3,5,6]
        int low=0;
        int high=n-1;
        int index=n;

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
        System.out.println("insert the give number at index : " + index);

        if(!array.contains(target)) {
            array.add(index, target);

        }
        System.out.println(array);

    }
}
