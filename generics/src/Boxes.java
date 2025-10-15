import java.util.ArrayList;
import java.util.List;

public class Boxes <T>{

    private List<T> data;

    public Boxes(List<T> data) {
        this.data = new ArrayList<>( data);

    }

    public void put(T value){
        data.add(value);
    }


    public void get(){

        for(T value: data){
            System.out.print(value);
        }
        System.out.println();
    }



    public static void main(String[] args) {

        List<String> str= List.of("sai","chai","P");
        List<Integer> nums= List.of(1,2,3,4,5);
        List<Double> decimals=List.of(1.3,3.4,5.4);

        Boxes<String> stringBalls= new Boxes<>(str);
        Boxes<Integer> integerBalls= new Boxes<>(nums);
        Boxes<Double> doubleBalls= new Boxes<>(decimals);

        stringBalls.get();
        integerBalls.get();
        doubleBalls.get();

        stringBalls.put("manubolu");
        //stringBalls.put(100);
        integerBalls.put(100);
        doubleBalls.put(100.99);

        stringBalls.get();
        integerBalls.get();
        doubleBalls.get();


    }
}
