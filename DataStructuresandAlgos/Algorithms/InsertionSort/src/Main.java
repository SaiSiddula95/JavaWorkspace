public class Main {
    public static void main(String[] args) {
        /*
        INsertion Sort: O(N^2)
        It's decent for small data but bad for large data

        Less steps than bubble sort
        Best Case is O(N) coimpared to Selection Sort's O(N^2)
         */

        int array[] = {9,1,8,2,7,3,6,4,5};

        insertionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int array[])
    {


        // i stands for the current pivot
        for(int i = 1; i < array.length; i++)
        {
            int temp = array[i];
            int j = i - 1;

            while( j>=0 && array[j] > temp)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

        }
    }

    private static void swapElements(int array[], int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}