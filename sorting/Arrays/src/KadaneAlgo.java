public class KadaneAlgo {

    public void maxSubArray(int [] arr) {

        int n = arr.length;

        int max = 0;
        int value = 0;
        int low = 0;
        int high = 0;
        for (int i = 0; i < n; i++) {
            value=0;

            for (int j = i; j < n; j++) {

                value = value + arr[j];
                if (value > max) {
                    max = value;
                    low = i;
                    high = j;
                }
            }

        }

        System.out.print("[");
        for (int k = low; k <= high; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("]");

    }

    public void subArrayOptimal(int [] arr){

        int n=arr.length;
        int max= Integer.MAX_VALUE;
        int sum=0;
        int start=0;
        int begin=0;
        int end=0;
        for(int i=0;i<n;i++) {

            if(sum==0){
                start=i;
            }
            sum+=arr[i];
                if(sum>max){
                 max=sum;
                 begin=start;
                 end=i;

                }



            if(sum<0){
                sum=0;
            }

        }
        //System.out.println(max);
        System.out.print("[");
        for (int k = begin; k <= end; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("]");



    }

    public static void main(String[] args) {

        int[] arr={-2,1 , 3, 5, -3000, -400, -9, -10};
        KadaneAlgo obj=new KadaneAlgo();
        obj.maxSubArray(arr);
        obj.subArrayOptimal(arr);

    }
}
