package MultiThreading;

 class InnerMultiThreadingWithThread extends Thread {
    public void run(){
      String name =  Thread.currentThread().getName();
        System.out.println( name+" Thread is running");
    }

    
}

public class MultiThreadingWithThread {
    public static void main(String[] args) {
        Thread t1=new Thread(new InnerMultiThreadingWithThread(), "t1");
        Thread t2=new Thread(new InnerMultiThreadingWithThread(), "t2");
        t1.start();
        
        t2.start();
    }
}
