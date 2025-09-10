import java.util.Scanner;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9,11};

        Scanner input=new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int num=input.nextInt();
        int n=arr.length;
        int count=0;
        int j=1;

        for(int i=0;i<n;){

            if(arr[i]== j+i){
                i++;
                continue;
            }
            else{
                System.out.println(j+i + " is missing");
                j++;

            }
        }
    }
}
