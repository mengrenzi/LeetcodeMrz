package Thread.Tickets;

public class TicketsRunable {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        Thread th1 = new Thread ( mt, "Window1" );
        th1.start ();
    }

}
