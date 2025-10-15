public class GenericsBasics {

    //problem it is solving is code reusability for different types
    //compile time checking.
    //type safety

    public <T> void printer(T[] arr){

        for(T element:arr){
            System.out.println(element);
        }

    }

    public static void main(String[] args) {

//        Object str= new Object();
//        str="sai";
//        String name= (String)str; //type casting is  required.
//
//        str=100;
//        String n=(String)str;  // no type checking and type safety

        GenericsBasics obj=new GenericsBasics();
        Integer[] arr={1,2,3,4,5};
        String[] str= {"sai","chaitanya","padiginati"};

        obj.printer(arr);
        obj.printer(str);







    }
}
