import java.util.HashMap;

public class TwoSum {

    public void twosum(int[] arr,int target){

        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){  //n

            for(int j=i;j<n;j++){  //1+2+3+...+ n-1 --> n(n+1)/2 --n2

                if(arr[i]+arr[j] == target ){
                    System.out.println("Yes");
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("NO");
            System.out.println("[ -1, -1]");
        }
    }

    public void twoSumBetter(int [] arr , int target){

        int n=arr.length;
        HashMap<Integer,Integer> bucket=new HashMap<>();

        for(int i=0;i<n;i++){

            int x=target-arr[i];

            if(bucket.containsKey(x)){
                System.out.println(bucket.get(x) + " " + i);
                return;
            }
            bucket.put(arr[i],i);

        }


    }

    public static void main(String[] args) {

        int[] arr={2,6,5,8,11};
        int target=11;
        TwoSum obj=new TwoSum();
        obj.twosum(arr, target);
        obj.twoSumBetter(arr,target);

    }
}
