public class Main {
    public static void main(String[] args) {
        /*
        QuickSort: Moves smaller elements to left of a pivot
        Recursively divide array in 2 partitions

        run-time complexity = Best case O(n log(n))
        Average case O(n log(n))
        Worst case O(N^2) if already sorted/ close to sorted.

        Space complixity O ( n log(n)
         */

        int[] array = {8,2,5,3,4,7,6,1};
        quickSort(array, 0, array.length - 1);
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }

    }

    private static void quickSort(int[] array, int startIndex, int endIndex){
        if(endIndex <= startIndex) return;
        int pivot = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivot - 1); // Left Parition SOrting
        quickSort(array, pivot + 1, endIndex);// Right Partition Sorting


    }

    private static int partition(int[] array, int startIndex, int endIndex){
        int pivot = array[endIndex];
        int i = startIndex - 1;

        for(int j = startIndex; j<endIndex; j++){
            if(array[j] <= pivot){//Any values less than our pivot, needs to be swapped
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[endIndex];
        array[endIndex] = temp;

        return i;
    }
}