public class ChronometerThread implements Runnable{
    private Thread thread;
    private String threadName;

    ChronometerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating a thread: " + threadName);
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i <= 5; i++){
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException exception){
            System.out.println("Error!");
        }

        System.out.println("Thread " + threadName + " is over.");
    }

    public void start(){
        System.out.println("Creating a thread object");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}