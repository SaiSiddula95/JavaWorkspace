public class Main {
    public static void main(String[] args) {
        /*
        Recursion = When a method is defined in terms of itself.
        We divide the problem into sub-problems of the same type as the original.

        Advantages:
        1. Easier to read/write
        2. Easier to debug

        Disadvantage:
        1. Sometimes slower
        2. Uses more memory
         */

        //walk(5);
        //walkRecursive(5);
        System.out.println("The factorial is: " + factorial(7));


    }

    public static void walk(int steps)
    {
        for (int i = 0; i < steps; i++)
        {
            System.out.println("You take a step!");
        }
    }

    public static void walkRecursive(int steps)
    {
        if(steps < 1) return; //Base Case
        System.out.println("You take a step!"); //Action
        walkRecursive(steps - 1); // Recursion

    }

    public static int factorial(int n)
    {
        if(n < 1) return 1;
        return n * factorial( n -1 );
    }


}