import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;

public class StackClass {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Inserting element to stack
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);

        // Display element
        int i =0;
        while (stack.elementAt(i) != null) {
            System.out.println(stack.elementAt(i));
            if(i==stack.size()-1){
                break;
            }
            i++;
        }
        // look out the first element
        System.out.println("Display top of element : "+stack.peek());
        
        // Remove top element
        stack.pop();
        System.out.println(stack.toString());
    }
}
