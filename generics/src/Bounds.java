import java.util.ArrayList;
import java.util.List;

public class Bounds {

    class Animals{

        public void sound(){
            System.out.println("all animals make sound");

        }
    }

    class Dog extends Animals{
        public void sound(){

            System.out.println("bow bow...");

        }
    }

    class Cat extends Animals{
        public void sound(){

            System.out.println("meow meow ...");

        }
    }

    public static void main(String[] args) {

        Bounds b= new Bounds();
        Bounds.Dog d1= b.new Dog();
        Bounds.Dog d2= b.new Dog();
        Bounds.Dog d3= b.new Dog();

        Bounds.Cat c1= b.new Cat();
        Bounds.Cat c2= b.new Cat();
        Bounds.Cat c3= b.new Cat();

        List<Dog> dogs= new ArrayList<>(List.of(d1,d2,d3));
        List<Cat> cats= new ArrayList<>(List.of(c1,c2,c3));

//        b.printlistDogs(dogs);
//        b.printlistCats(cats);
//    b.printAnimals(dogs);
//    b.printAnimals(cats);
    List<Animals> a= new ArrayList<>();
    List<Object> o= new ArrayList<>();

    b.addDogs(a);
    b.addDogs(o);

        System.out.println(a.size());
        System.out.println(o.size());




    }

    public void printAnimals(List<? extends Animals> animals){
        for(Animals a: animals){
            a.sound();
        }
    }

    public void addDogs( List< ? super Dog> dog){

        dog.add(new Dog());
        dog.add(new Dog());


    }


//    public  void printlistDogs(List<Dog> dogs){
//        for(Dog d : dogs){
//           d.sound();
//        }
//    }
//
//    public void printlistCats(List<Cat> cats){
//        for(Cat c : cats){
//            c.sound();
//        }
//    }
}
