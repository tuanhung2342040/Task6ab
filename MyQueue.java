import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> queue;
    private int back;
    public MyQueue() {
        queue = new ArrayList<>(0);
        back = 0;
    }
    public void enQueue(int num){
        queue.add(num);
        back++;
    }
    public Integer deQueue(){
        Integer toReturn = null;
        if(queue.size() > 0){
            queue.remove(0);
            back--;
        }
        return toReturn;
    }
    public Integer peek(){
        Integer toReturn = null;
        for(int i = 0; i < queue.size();i++){
            toReturn = queue.get(0);
        }
        return toReturn;
    }
    public void getBack(){
        System.out.println(back);
    }
}
