import java.util.ArrayList;

public class RemoveDuplicateArray {

    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(4);

        int n=arr.size();
        boolean[] boolarr=new boolean[n];

        for(int i=0;i<n;i++){

            int j=i+1;

            while(j<n && boolarr[i] == false ){

                if(arr.get(i) == arr.get(j)) {


                    arr.remove(j);
                    n--;
                  //  boolarr[i]=true;

                }

                else{
                    j++;
                }

            }


        }

        System.out.println(arr);
    }
}
