import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {

    public void rearrageArray(int[] arr){

        int n=arr.length;
        int i=0;
        int left=i;
        int right=left+1;
        while(i<n){


           if(arr[left] >0 && arr[right] >0){
               i+=1;
               left+=1;
               right+=1;
           }
           else if(arr[right] <0 ){
               swap(left,right,arr);

               left=left+2;
               right=right+2;
               i = right;
           }
           else{


               left+=1;
               right+=1;
               i=right;
           }



        }
        System.out.println(Arrays.toString(arr));
    }

    public void swap(int left, int right,int[] arr){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public int[] rearrangeArray1(int[] arr) {

        //3,1,-2,-5,2,-4

        int n=arr.length;
        int size =n/2;
        int[] pos= new int[size];
        int[] neg=new int[size];
        int k=0;
        int m=0;
        int p=0;int ne=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0){
                pos[k] = arr[i];
                k+=1;
            }
            else if(arr[i] <0){
                neg[m] = arr[i];
                m+=1;
            }

        }

        for(int j=0;j<n/2;j++){

            arr[j*2]=pos[j];
            arr[j*2+1]=neg[j];
        }



        return arr;

    }

    public static void main(String[] args) {
        int[] arr={1, 2, -4, -5, 3, -4};
        RearrangeArray obj=new RearrangeArray();
        int[] result=obj.rearrangeArray1(arr);
        System.out.println(Arrays.toString(result));
        String s="sai";
        Scanner in = new Scanner(System.in);



    }
}
