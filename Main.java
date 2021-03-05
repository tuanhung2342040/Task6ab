public class Main {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(8);
        q.enQueue(10);
        q.deQueue();
        q.enQueue(5);
        System.out.println(q.peek());
        q.getBack();

    }
}
