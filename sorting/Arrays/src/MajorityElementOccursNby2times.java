import java.util.HashMap;
import java.util.Map;

public class MajorityElementOccursNby2times {

    public static int majorityElementOccurNby2times(int[] arr){

        int n=arr.length;
        HashMap<Integer,Integer> bucket=new HashMap<>();
        bucket.put(arr[0],1);
        int value=1;
        int max=0;

        int i=1;
        while(i<n){
            if(bucket.containsKey(arr[i])){
                bucket.put(arr[i],value++);
                i++;
            }
            else{
                bucket.put(arr[i],1);
                i++;
            }
        }

        for(Map.Entry<Integer, Integer> it: bucket.entrySet()){
            if(it.getValue() > (n/2)){
              return it.getKey();

            }
        }

       return -1;

    }

    public static void main(String[] args) {
        int[] arr= {3,2,3};
        System.out.println(majorityElementOccurNby2times(arr));

    }
}
