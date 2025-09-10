public class NumberAppearsOnce {



    public static void main(String[] args) {

        int[] arr={ 1,2,2,3,1,4,3};

        int n=arr.length;
       // int value=0;
        int[] arr2=new int[n];


        for(int i=0;i<n;i++){
int value=0;
            for(int j=0;j<n;j++){

                if(arr[i]== arr[j]){
                    arr2[i]=++value;

                }
            }
            //value=0;
        }

        for(int k=0;k<n;k++){

            if(arr2[k] == 1){
                System.out.println(arr[k] + "is present only one's in array  ");
            }
        }

    }
}
