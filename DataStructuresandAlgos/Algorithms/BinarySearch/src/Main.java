

public class Main {
    public static void main(String[] args) {
        /*
        Binary Search: Search algorithm that finds the position of a target value within a sorted array.
        Half of the array is eliminated during each step.

         */

        int array[] = new int[1000000];
        int target = 777777;

        for(int i=0; i<array.length; i++)
        {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if(index == -1)
        {
            System.out.println("Target not found");
        }else {
            System.out.println("Target found at index: " + index);
        }

    }

    private static int binarySearch(int[] array, int target)
    {
        int low = 0;
        int high = array.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            int value = array[mid];
            System.out.println("Middle: " + value);

            if(value < target)
            {
                low = mid + 1;
            }else if(value > target)
            {
                high = mid - 1;
            }else return mid;
        }


        return -1; //Target is not found
    }

}