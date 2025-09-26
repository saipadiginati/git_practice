package bsOnAnswers;

import java.util.List;

public class SmallestDivisor {

    public void smallDrv(List<Integer> arr, int limit){

        int n=arr.size() -1;
        //int i=1;
        int num=1;
        int count=1;
        int j=1;
        while(j <=1){

            int sum=0;

            for(int i=0; i<=n;i++){
                sum=sum + (int)(Math.ceilDivExact(arr.get(i),num));
                count=num;
            }
            num++;

            if(sum<= limit){
                j--;
                break;
            }

        }
        System.out.println(count);

    }
}
