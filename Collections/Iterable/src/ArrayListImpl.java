import java.util.Arrays;

public class ArrayListImpl {

    private Object[] data;
    private int size=0;
    private final int initialCapacity=10;

    public ArrayListImpl(){

        data= new Object[initialCapacity];

    }

    public void addElements(Object value ){

        if(size == data.length){
            grow();
        }
        data[size++]= value;
    }
    public void grow(){

        int newCapacity=  data.length +data.length/2;
        Object[] newData= new Object[newCapacity];
        System.arraycopy(data,0, newData,0,data.length);
        data= newData;
    }

    public Object get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void removeElement(int index) {

        if (data.length > 0) {

            int shift = size - index - 1;
            System.arraycopy(data, index + 1, data, index, shift);
            data[--size] = null;

        }
    }
        public void printElements(){

        for(int i=0;i<data.length;i++){
            System.out.print(data[i] + " ");
        }
        }




    public static void main(String[] args) {

        ArrayListImpl arr= new ArrayListImpl();
        for(int i=0;i<20;i++){
            arr.addElements(i);
        }

        System.out.println(arr.get(15));
        System.out.println(arr.size());
        arr.printElements();
        arr.removeElement(12);
        System.out.println();
        arr.printElements();



    }
}
