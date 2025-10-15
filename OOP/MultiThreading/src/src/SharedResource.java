public class SharedResource {

    public synchronized void task1(){

        System.out.println("I am inside task 1" + Thread.currentThread().getName());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Task1 completed");
        notifyAll();
    }

    public void task2() {

        System.out.println("i am inside task2" + Thread.currentThread().getName());

        synchronized (this) {
            System.out.println("task2 completed" + Thread.currentThread().getName());
        }
    }

        public void task3(){

            System.out.println("task3 completed" + Thread.currentThread().getName());
        }

}
