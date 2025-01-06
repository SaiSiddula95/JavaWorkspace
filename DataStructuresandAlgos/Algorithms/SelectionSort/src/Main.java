public class Main {
    public static void main(String[] args) {
        /*
        Selection Sort:
         */

        int array[] = {9,1,8,2,7,3,6,4,5};

        selectionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] array) {

        for(int i=0; i<array.length-1; i++) {
            // Keeping Track of the current min value and index

            int minIndex = i;

            // We need to traverse through the current unsorted array (min = i, max = end of array)
            for(int j=i+1; j<array.length; j++)
            {
                // If the Value of the J index is the lowest
                if( array[j] < array[minIndex] )
                {
                    minIndex = j;
                }
            }
            // Swap lowest min with index i
            if( i != minIndex )
            {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }


        }
    }

}