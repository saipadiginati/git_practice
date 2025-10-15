class Node<T>{
    T data;
    Node<T> next;


    public Node(T data){
        this.data=data;
        this.next=null;
    }
}

public class LLImpl<T> {

    Node<T> head;
    int size;

    public void addElementFirst(T data){
        Node<T> newNode= new Node<T>(data);
        newNode.next=head;
        head= newNode;
        size++;
    }

    public void addElementsLast(T data){
        Node<T> newNode= new Node<>(data);
        Node<T> currentNode=head;
        while(currentNode.next!=null){
            currentNode= currentNode.next;
        }
        currentNode.next= newNode;
        size++;
       // System.out.print("null");

    }

    public void removeFirst(){

        head= head.next;
        size--;
    }

    public void removeLast(){

        Node<T> currentNode= head;
        Node<T> previousNode=head;

        while(currentNode.next!=null){
            previousNode=currentNode;
            currentNode=currentNode.next;
        }
        previousNode.next=null;
        size--;
    }

    public void remove(int index){
        int i=0;
        Node<T> currentNode= head;
        Node<T> previousNode=null;
        while(i < index-1){
            i++;
            //previousNode=
            currentNode= currentNode.next;
        }
        currentNode.next= currentNode.next.next;
        size--;
    }

    public void printElements(){

        Node<T> currentNode= head;
        while(currentNode!= null){
            System.out.print(currentNode.data + " ->");
            currentNode=currentNode.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.print(size);
    }

    public static void main(String[] args) {

        LLImpl<Integer> ll= new LLImpl<>();
        ll.addElementFirst(1);
        ll.printElements();
        ll.addElementFirst(2);
        System.out.println();
        ll.printElements();
        System.out.println();
        ll.addElementsLast(3);
        ll.addElementsLast(4);
        ll.printElements();
//        ll.removeFirst();
//        System.out.println();
//        ll.printElements();
//        System.out.println();
//        ll.removeLast();
//        ll.printElements();
//        System.out.println();
//        ll.remove(1);
//        ll.printElements();

    }
}
