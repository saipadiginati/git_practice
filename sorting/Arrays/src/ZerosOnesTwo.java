import java.util.Arrays;

public class ZerosOnesTwo {

    public int[] sortedNumbersbrruteforce(int[] arr){

        int n=arr.length;

        //1,0,1,0,2,1,0

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                if(arr[j] < arr[i])
                {
                    swap(i,j,arr);
                }
            }
        }

        return arr;


    }

    public void swap(int i, int j,int [] arr){

        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;

    }

    public void sortedNumbersBetter(int[] arr){

        int n=arr.length;
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int i=0;i<n;i++){        //1,0,1,0,2,1,0
            if(arr[i] ==0) {
                zeroCount =zeroCount+1;
            }
            if(arr[i]==1){
                oneCount =oneCount+1;
            }
            if(arr[i] == 2){
                twoCount+=1;
            }

        }
        System.out.println(zeroCount + " " + oneCount + " " + twoCount);

        for(int j=0;j< zeroCount;j++){             //1,0,1,0,2,1,0
            arr[j] =0;
        }
        for(int j=zeroCount;j< oneCount+zeroCount;j++){
            arr[j] =1;
        }
        for(int j=oneCount+zeroCount; j< twoCount+oneCount+zeroCount;j++){
            arr[j] =2;
        }

        System.out.println(Arrays.toString(arr));

    }

    public void sortedNumbersOptimal(int[] arr){
        int n=arr.length;

        //2,0,1,1,2,0  --> low =0,mid=0and high=n-1 and if(
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<= high){

            if(arr[mid]==0){
                swap(mid,low,arr);
                mid++;
                low++;
            }
            else if(arr[mid] ==1){
                mid++;
            }
            else{
                swap(mid,high,arr);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int[] arr={2,0,1};

        ZerosOnesTwo obj=new ZerosOnesTwo();
        //obj.sortedNumbersbrruteforce(arr);
        //System.out.println(Arrays.toString(arr));
        //obj.sortedNumbersBetter(arr);
        obj.sortedNumbersOptimal(arr);

    }
}
