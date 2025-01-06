public class Main {
    public static void main(String[] args) {

       DynamicArray dynamicArray = new DynamicArray();

        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        System.out.println(dynamicArray);

        /*
        Advantages of Dynamic Arrays:
        1. Random access of elements O(1)
        2. Good locality of reference and data cache utilization
        3. Easy to insert/delete at the end

        Disadvantages:
        1. Wastes more memory
        2. Shifting elements is the time consuming O(n)
        3. Expanding/Shrinking the array is time consuming O(n)
         */

    }
}