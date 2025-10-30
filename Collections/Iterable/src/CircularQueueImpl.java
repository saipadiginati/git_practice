import java.util.Arrays;

public class CircularQueueImpl {

    int[] arr;
    int size;
    int capacity;
    int rear, front;

    public CircularQueueImpl(int n){
        arr= new int[n];
        capacity=arr.length;
    }

    public void enqueue(int element){
        if(size==capacity){
            System.out.println("arr is full");
            return;
        }

        rear= (rear+1)%capacity;
        arr[rear]=element;
        rear++;
        size++;
    }

    public void dequeue(){
        arr[front]=0;
        front++;
    }
    public void printElements(){
        int i=front;
        int j=0;

        while(j<size){

            System.out.print(arr[i] + ",");
            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        CircularQueueImpl cq= new CircularQueueImpl(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println(cq.size);
        cq.printElements();
        cq.dequeue();
        cq.printElements();


    }
}
