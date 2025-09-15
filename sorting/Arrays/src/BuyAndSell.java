public class BuyAndSell {

    public void buyAndSell(int[] arr){

        int n=arr.length;

        //[2,1,4,6,3,2,5]

        int min=arr[0];
        int profit=0;
        //int sum=0;
        int cost=0;

        for(int i=1;i<n;i++){

            cost=arr[i]-min;

            profit=Math.max(profit,cost);
            min=Math.min(arr[i],min);
        }
        System.out.println(profit);
    }


    public static void main(String[] args) {

        int [] arr={2,1,4,7,3,2,6,5};
        BuyAndSell obj=new BuyAndSell();
        obj.buyAndSell(arr);
    }
}
