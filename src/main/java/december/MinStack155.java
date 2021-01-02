package december;

import java.util.ArrayList;
import java.util.List;

public class MinStack155 {

    private List<Integer> list;
    private int min = Integer.MAX_VALUE;
    private int index = 0;

    public MinStack155() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        min = Math.min(x, min);
        list.add(index, x);
        index++;
    }

    public void pop() {
        list.remove(index-1);
        index--;
        min = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            min = Math.min(list.get(i), min);
        }
    }

    public int top() {
        return list.get(index-1);
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack155 minStack = new MinStack155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   //--> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());      //--> 返回 0.
        System.out.println(minStack.getMin());   //--> 返回 -2.

    }

}
