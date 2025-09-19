public class Main {

    public static void main(String[] args) {

        int [] arr={1,1,2,3,4,5,7,8,9};

        int target=6;

        Basics obj=new Basics();
        //obj.bs(arr,target);
        LowerBound lb= new LowerBound();
        //lb.lowerBound(arr,target);
        InsertionPosition ip=new InsertionPosition();
        //ip.ip(arr,target);
        FloorAndCeiling f=new FloorAndCeiling();
        f.floor(arr, target);
        f.ceiling(arr,target);


    }
}
