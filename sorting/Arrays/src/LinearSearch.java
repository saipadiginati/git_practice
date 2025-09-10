import java.util.Scanner;

public class LinearSearch
{

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,7,4};

        Scanner input=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=input.nextInt();
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==num){
                count++;
                System.out.println(num+ " is present at index " + i );

            }

        }
        if(count == 0){
            System.out.println(-1);
        }

    }

}
