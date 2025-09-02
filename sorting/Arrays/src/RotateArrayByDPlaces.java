import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByDPlaces {

    public static void main(String[] args) {

        //[1,4,3,2,5] -- n=5.
        int[] arr= {1,4,3,2,5};
        //rotate array by D places
        int n= arr.length;


        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of K:");  // ex:k=2
        int k= input.nextInt();
        int D=k%n;
        int[] temp= new int[D];
        int count=0;


        for(int j=0;j<D;j++){

            temp[j]=arr[j];  //temp[] = 1,4
        }

        for(int i=0;i<n-D;i++){

            arr[i]=arr[D+i];
            count=i;

        }
        for(int p=0;p<D;p++){
            arr[count+1+p]=temp[p];
        }

        System.out.println(Arrays.toString(arr));


    }
}
