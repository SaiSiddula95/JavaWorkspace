public class Main {
    public static void main(String[] args) {
        /*
        Interpolation Search. Improvement over binary search best used for "uniformly" distributed "guesses" where a value might be based on calculated probe
        results if probe is incorrect, search area is narrowed and a new probe

        Average case: O( log(log(N)))
        Worst Case: O(N)
         */

        int[] array = {1,2,3,4,5,6,7,8,9};

        int index = interpolationSearch(array,1);

        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + index);
        }
    }

    private static int interpolationSearch(int[] array, int value)
    {
        int high = array.length - 1;
        int low = 0;

        while(value >=array[low] && value  <= array[high] && low<=high)
        {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe = " + probe);

            if(array[probe] == value)
            {
                return probe;
            }else if(array[probe] < value)
            {
                low = probe+1;
            }else high = probe-1;
        }

        return 0;
    }
}