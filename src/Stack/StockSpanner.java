/*
package Stack;



import java.util.Stack;

class Pair<K,V>{
    private K key;
    private K value;

}

public class StockSpanner {Stack<Pair<Integer,Integer>> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int count = 1;
        while(!stack.isEmpty() && stack.peek().getKey() <= price){
            count = count + stack.pop().getValue();
        }

        stack.push(new Pair(price, count));
        return count;
    }

}
*/
