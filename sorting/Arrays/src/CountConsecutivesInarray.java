public class CountConsecutivesInarray {


    public void consecutiveOnesInArray(int[] arr){

        //[1,1,0,1,1,0,0,0]
        int n= arr.length;
        int onesCount=0;
        int zeroCount=0;
        int max1=0;
        int max0=0;

        for(int i=0;i<n;i++){

            if(arr[i] == 1)
            {
             onesCount++;  //2

                if(zeroCount>max0){
                    max0=zeroCount;
                    zeroCount=0;
                }

            }

            else{
                zeroCount++;  //0

                if(onesCount>max1){   //2>0

                max1=onesCount;//max=2

                    onesCount=0;
                }

            }




        }

        if(max1>max0){
            System.out.println(max1 + " times 1's repeated consecutively");
        }
        else{
            System.out.println(max0 + " times 0's repeated consecutively");
        }


    }

    public static void main(String[] args) {

        int[] arr={1,1,1,0,0,0,0,1,1,0,1};

        CountConsecutivesInarray obj=new CountConsecutivesInarray();
        obj.consecutiveOnesInArray(arr);
    }
}
