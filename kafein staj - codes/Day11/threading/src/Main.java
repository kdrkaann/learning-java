public class Main {
    public static void main(String[] args) {
        ChronometerThread thread1 = new ChronometerThread("thread1");
        ChronometerThread thread2 = new ChronometerThread("thread2");

        thread1.start();
        thread2.start();
    }
}
