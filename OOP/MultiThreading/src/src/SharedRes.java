public class SharedRes {
    int i=1;
    boolean isFileAvailable=false;
    synchronized  public void producer(){
        while(isFileAvailable)
        {
            try {
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("producer produces the vlaue" + ++i + "current thread" + Thread.currentThread().getName());
        isFileAvailable=true;
        notifyAll();
    }

    synchronized public void consumer(){

        try {
            while (!isFileAvailable) {

                wait();
            }
        }
            catch(Exception e){
                System.out.println(e);
            }

        System.out.println("consumer consumes value" + i + "current thread is" + Thread.currentThread().getName());
        isFileAvailable=false;
        notifyAll();
    }
}
