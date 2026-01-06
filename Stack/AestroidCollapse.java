package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AestroidCollapse {
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int aestroid : asteroids) {
            boolean destroyed = false;

            while (!dq.isEmpty() && dq.peek() > 0 && aestroid < 0) {
                int top = Math.abs(dq.peek());
                int curr = Math.abs(aestroid);

                if (top < curr) {
                    dq.pop();
                    continue;
                } else if (top == curr) {
                    dq.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                dq.push(aestroid);
            }
        }

        int[] res = new int[dq.size()];
        int k = 0;
        while (!dq.isEmpty()) {
            res[k++] = dq.removeLast();
        }

        return res;

    }

    public static void main(String[] args) {
        int[] asteroids = { 3, 5, -6, 2, -1, 4 };
        int[] nums = asteroidCollision(asteroids);

        for (int i : nums) {
            System.out.print(i);
        }

    }
}
