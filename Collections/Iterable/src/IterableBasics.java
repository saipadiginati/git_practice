import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterableBasics {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        nums.add(8);

        Iterator<Integer> it= nums.iterator();
        while(it.hasNext()){
            System.out.print(it.next());


        }

        //System.out.println(nums);
//        for(Integer num : nums) {
//            System.out.print(num);
//        }
//        nums.forEach(
//                (Integer num) -> System.out.print(num)
//
//        );

//        Consumer<Integer> consume= num  -> System.out.print(num) ;
//
//        for(int i=0;i<nums.size();i++)
//            consume.accept(nums.get(i));
//
//
//    }

//        @Override
//        public Iterator iterator () {
//            return null;
//        }
    }
}

//class ConsumerImpl<T> implements Consumer<T>{
//
//    @Override
//    public void accept(T t) {
//        System.out.print(t);
//    }
//}
