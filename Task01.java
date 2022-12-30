import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Реализовать алгоритм сортировки слиянием


public class Task01 {
   
    public static int[] mergeSort(int[] sortArr) {
        int[] arr1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] arr2 = new int[sortArr.length];
        int[] result = mergeSortInner(arr1, arr2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] arr1, int[] arr2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return arr1;
        }

       
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sort1 = mergeSortInner(arr1, arr2, startIndex, middle);
        int[] sort2 = mergeSortInner(arr1, arr2, middle, endIndex);

        
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sort1 == arr1 ? arr2 : arr1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sort1[index1] < sort2[index2]
                    ? sort1[index1++] : sort2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sort1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sort2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 3, 2};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
    
}
