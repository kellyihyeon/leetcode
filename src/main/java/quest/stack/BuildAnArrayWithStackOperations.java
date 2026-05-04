package quest.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildAnArrayWithStackOperations {

    // * target 은 정렬 처리 되어 있다.
    // stream 을 만든다. 1부터 n까지 정수 공급용.
    // stack 에 stream 의 값을 push 한다. (기록)
    // stack 의 값이 target 과 일치하지 않으면 pop 한다.
        // 일치하는지 어떻게 판단할 건데?
        // 인덱스를 increment 해서 하면?
        // index = 0, target[index] 와 stack 의 top 을 비교한다.
        // 일치하면 index 를 +1 증가시킨다.
        // 불일치하면 stack 의 값을 pop 한다. (기록)
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        for (int i = 1; i < n + 1; i++) {
            stack.push(i);
            result.add("Push");

            if (target[index] == stack.peek()) {
                index++;
            } else {
                stack.pop();
                result.add("Pop");
            }

            if (index == target.length) {
                break;
            }
        }

        return result;
    }
}
