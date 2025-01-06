import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        /*
        Main Methods: Push, Pop, Peek, isEmpty, search
         */
        //Checks if stack is empty
        System.out.println("The stack is: " + stack.isEmpty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        System.out.println("The stack is: " + stack.isEmpty());
        System.out.println("The current stack values are: " + stack);

        //The top of the stack can be found using peek
        System.out.println("The top of the stack: " +stack.peek());

        // Removing the top of the stack
        stack.pop();
        // We should have removed FFVII
        System.out.println("The current stack values are: " + stack);

        /*
            Best uses of Stacks:
            1. undo/redo features in text editors
            2. Moving back/forward through browser history
            3. Backtracking algorithms (maze, file directories)
            4. Calling functions (call stack)
         */


    }
}