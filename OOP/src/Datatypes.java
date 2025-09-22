public class Datatypes {
    public static void main(String[] args) {

//
//        float f = (int) 12.33;
//        int i=(byte) -129;
//        System.out.println(i);
//
//        int x=1;
//
//        do {
//            System.out.println(x);
//            x++;
//        }
//        while(x<1);

        int a=10;
        System.out.println(a);
        int b=Datatypes.funPrimitives(a);
        System.out.println(a + " " + b);
        String name=new String("sai");


        System.out.println(name);
        String naam=Datatypes.funObjects(name);
        name=naam;
        System.out.println(name + " " + naam);
        }




        public  static String funObjects(String naam){
         String n;
         n=naam;

        n="chaitanya";
        return n;
        }

    public static  int funPrimitives(int value){
        int b=value;
        b=5;
        return b;

    }

    int a=5;
    int b=



}
