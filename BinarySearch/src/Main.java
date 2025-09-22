import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int [] arr={1,1,2,3,4,4,0,5,7,8,9};

        int target=5;

        Basics obj=new Basics();
        //obj.bs(arr,target);
        LowerBound lb= new LowerBound();
        //lb.lowerBound(arr,target);
        InsertionPosition ip=new InsertionPosition();
        //ip.ip(arr,target);
        FloorAndCeiling f=new FloorAndCeiling();
       // f.floor(arr, target);
        //f.ceiling(arr,target);
        //LastOccuranceInSortedArray ls= new LastOccuranceInSortedArray();
        //ls.lastOccurance(arr,target);

        CountOccurance count=new CountOccurance();
        //count.count(arr,target);

        RotatedSortedArray rs= new RotatedSortedArray();
        //int res= rs.rs(arr,target);
        //System.out.println(arr[res]);

       // MinimumRotatedSortedArray min=new MinimumRotatedSortedArray();
       // System.out.println(min.minimumRotated(arr));

        HowManyTimesRotated r=new HowManyTimesRotated();
        ArrayList<Integer> nums= new ArrayList<>();

//        nums.add(4);
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        //int result=r.rotate(nums);
        //result=result;
        //System.out.println("array is rotate " + result  + " times");
        SingleElement element=new SingleElement();
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int result=element.singleElement(arr1);
        System.out.println(arr1[result] + " is a single element");




    }
}
