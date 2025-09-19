import java.util.ArrayList;

public class Basics {

public void bs(int[] arr,int target){

    int n=arr.length;
    int low=0;
    int high=n-1;
    int count=0;
    while(low <=high){

       int  mid=(low+high)/2;

       if(arr[mid]==target){
           System.out.println("given number present at index" + mid);
           count++;
           break;
       }
        else if(arr[mid] > target) {
        high=mid-1;
       }
        else{
            low=mid+1;
       }
    }

    if(count==0){
        System.out.println("given number is not present int he array" );


    }
}
}
