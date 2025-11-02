package Stack;

import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int asteroid : asteroids){
            boolean alive = true;
            while(!stack.isEmpty() && asteroid < 0 && stack.peek() > 0){
                if(Math.abs(asteroid) > Math.abs(stack.peek())){
                    stack.pop();
                }else if(Math.abs(asteroid) == Math.abs(stack.peek())){
                    stack.pop();
                    alive = false;
                    break;
                }else{
                    alive = false;
                    break;
                }
            }

            if(alive == true){
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for(int i = stack.size()-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;

    }

    public static void main(String[] args) {
        int[] asteroids = {3,5,-6,2,-1,4};
        System.out.println(asteroidCollision(asteroids));

    }
}
