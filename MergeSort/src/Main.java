public class Main {
    public static void main(String[] args) {
        /*
        Merge Sort:
        O(n*log(n) - Faster than insertion sort, bubble sort and selction sort for bigger data but needs more data
         */

        int[] array = {8,2,5,3,4,7,6,1};
mergeSort(array);
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }

    }

    private static void mergeSort(int[] array){
        int length = array.length;
        if(length <=1 ) return; // Base Case

        int mid = length/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length-mid];

        int i = 0; //Left indecies
        int j = 0; // Right indexies

        for(; i < length; i++){
            if(i < mid){
                leftArray[i] = array[i];
            }
            else
            {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array)
    {
        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;
        int i = 0, l = 0, r = 0;

        //Check the condition for merging
        while(l<leftSize && r<rightSize){
            if(leftArray[l]<rightArray[r])
            {
                array[i] = leftArray[l];
                i++;
                l++;
            }else
            {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize)
        {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize)
        {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

}