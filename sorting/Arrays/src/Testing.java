public class Testing {


        public int maxSubArray(int[] arr) {

            int n=arr.length;
            int max=Integer.MIN_VALUE;
            int sum=0;
            int start=0;
            int begin=0;
            int end=0;
            int count=0;
            for(int i=0;i<n;i++) {

                if(sum==0){
                    start=i;
                }
                sum+=arr[i];


                if(sum>max){
                    max=sum;
                    begin=start;
                    end=i;
                    count++;


                }
                if(sum<0){
                    sum=0;

                }

                if(count == 1){


                    for(int j=0;j<n;j++){

                        max=Math.max(max,arr[j]);
                    }
                }



            }

            if(max<0){
                return -1;
            }

            if(max == 0){
                return 0;
            }
            else
                return max;
        }

    public static void main(String[] args) {

        int [] arr={-3,-2,-2,-3};
        Testing obj=new Testing();
        System.out.println(obj.maxSubArray(arr));


    }
}
