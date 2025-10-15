public class QueueImpl {

    int[] arr;
    int size,capacity;
    int rear,front;

    public QueueImpl(int size){

        arr= new int[size];
        rear=-1;
        front=0;
        capacity=arr.length;
        size=0;
    }

    public void enqueue(int element){

        if(size==capacity){
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear] =element;
        size++;
    }

    public void dequeue(){
        if(size==0){
            System.out.println("array is empty");
        }
        for(int i=0;i<rear;i++){
            arr[i]= arr[i+1];
        }
        rear--;
        size--;
    }

    public void printElements(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i] + " ,");
        }
    }

    public static void main(String[] args) {
        QueueImpl que= new QueueImpl(5);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(1);
        que.enqueue(99);
        que.enqueue(100);

       // System.out.println(que);
        que.printElements();
        System.out.println();
        que.dequeue();
        que.dequeue();
        que.enqueue(10);
        que.printElements();
    }

}
