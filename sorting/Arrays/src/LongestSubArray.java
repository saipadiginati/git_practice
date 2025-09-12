import java.util.HashMap;

public class LongestSubArray {

    public void findLongestSubarrayOfGivenSumByBruteForce(int[] arr , int num)

    {
        int n=arr.length;
        int len=0;
        int low=0;
        int high=0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];

                if(sum==num){

                    if (len < (j - i + 1)) {

                        low=i;
                        high=j;
                    }
                    len= Math.max(len,j-i+1);


                }
            }
        }

        System.out.println(len);
        System.out.print("[");
        for(int i=low;i<=high;i++){
            System.out.print(arr[i]);
        }
        System.out.print("]");

    }

    public void findLongestSubArrayofGivenSumByBetter(int[] arr, int num){

        int n=arr.length;
        int sum=0;
        int len=0;
        HashMap<Integer,Integer> bucket=new HashMap<>();

        for(int i=0;i<n;i++){

            sum+=arr[i];



           // bucket.put(sum,i);

            if(sum== num){

                len=Math.max(len,i+1);
            }

            int rem=sum-num;
            if(bucket.containsKey(rem)){
                len=Math.max(len,i-bucket.get(rem));
            }

            if(!bucket.containsKey(sum))
            {
                bucket.put(sum,i);
            }

        }
        System.out.println(len);
    }

    public void findLongestSubArrayofGivenSumByOptimal(int[] arr, int num){

        //[1,2,3,1,1,1]
        int n=arr.length;
        int left=0;
        int right=0;
        int len=0;
        int sum= arr[left];
        int i=0;

       while(right<n) {
           while (left <= right && sum > num) {
               sum = sum - arr[left];
               left++;
           }


           if (sum == num) {
               len = Math.max(len, right - left + 1);

           }

           right++;
           if (right < n) {
               sum += arr[right];
           }


       }



        System.out.println(len);
    }


    public static void main(String[] args) {

        int[] arr= {1,2,3,1,1,1,1,4,2,3};
        int[] arr1= {1,2,0,3,-1,1,0,0,1,1};

        int[] arr2={1,2,3,1,1,1,3,4};
        int num=8;
        LongestSubArray obj=new LongestSubArray();
        //obj.findLongestSubarrayOfGivenSumByBruteForce(arr,num);
        //obj.findLongestSubArrayofGivenSumByBetter(arr1,num);
        obj.findLongestSubArrayofGivenSumByOptimal(arr2,num);



    }
}
