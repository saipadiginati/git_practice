import java.util.HashMap;
import java.util.Map;

public class Hashing {

    public static void main(String[] args) {
int maxi=0;

        int[] arr={1,2,3,1,2};
        int mini= arr.length;

        HashMap<Integer,Integer> maping= new HashMap<>();

        for(int nums:arr){

            maping.put(nums, maping.getOrDefault(nums,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: maping.entrySet() ) {
            mini =Math.min(entry.getValue(),mini);
            maxi=Math.min(entry.getValue(),maxi);

        }


    }
}
