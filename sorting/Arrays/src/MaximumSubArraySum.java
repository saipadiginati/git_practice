public class MaximumSubArraySum {

    public void maximumSubArray(int[] arr){

        int n=arr.length;
        int max=0;
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){

                sum+=arr[j];

                if(sum>max){

                    max=sum;
                    low=i;
                    high=j;
                }
            }
        }
        System.out.println("maximum sum is :" + max);
        for(int k=low;k<=high;k++){
            System.out.print(arr[k]+ " ");
        }


    }

    public void maximumSubArray1(int[] arr){

        int n=arr.length;

        int max=Integer.MIN_VALUE;
        int sum=0;
        int left=0;
        int right=0;
        int start=0;
        for(int i=0;i<n;i++){
            if(sum==0){
                left= i;
            }
            sum+=arr[i];



            if(sum>max){

                max=sum;
                start=left;
                right=i;
            }

            if(sum<0){
                sum=0;
                left=0;
            }
        }
        System.out.println(max);

        for(int k= left;k<=right;k++){
            System.out.print(arr[k]+ " ");
        }
    }

    public static void main(String[] args) {

        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArraySum obj=new MaximumSubArraySum();
        obj.maximumSubArray1(arr);
    }
}
