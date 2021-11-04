package divideAndConquer;
import java.util.Arrays;
import java.util.Collections;
public class MaxDC {
    // YOUR CODE GOES HERE
    private int[] array;
    private int[] tempArray;

    public void sort(int[] array) {
        this.array = array;
        this.tempArray = new int[array.length];
        mergeSort(0, array.length - 1);
    }

    //Function for recursively sorting the array in 2
    private void mergeSort(double left, double right) {
        if(left < right) {
            double mid = (left + right)/2;

            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    //Function for merging values into a sorted array
    private void merge(double left, double mid, double right) {
      int i;
      int j = (int)mid + 1;
    
      for(i = (int)left; i <= right; i++) {
          this.tempArray[i] = this.array[i];   
      }
      
      int k = (int)left;
        
        while (i <= mid && j <= right) {
            if(this.tempArray[i] <= this.tempArray[j]) {
                this.array[k] = this.tempArray[i];
                i++;
            }
            else {
                this.array[k] = this.tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            this.array[k] = this.tempArray[i];
            k++;
            i++;
        }
    }


    public int maxDivideAndConquer(int[] arr) { 
        sort(arr);
        int max = Collections.max(Arrays.asList(arr));
        return max;
    }

   
}
