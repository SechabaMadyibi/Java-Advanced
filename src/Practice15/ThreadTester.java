package Practice15;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("main is starting");
        Thread1 thread1 = new Thread1();
        thread1.start();
        System.out.println("main is exiting");
    }
}
