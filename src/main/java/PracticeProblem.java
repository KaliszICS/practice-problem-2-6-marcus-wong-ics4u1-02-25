public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int[] bubbleSort(double[] nums) {
        int[] result = new int[2]; 
        int n = nums.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                result[1]++; // comparison
                if (nums[j] > nums[j + 1]) {
                    double temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    result[0] += 3; // each swap counts as 3 operations
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        return result;
    }

    public static int[] selectionSort(double[] nums) {
        int swaps = 0;
        int comparisons = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++; 
                if (nums[j] < nums[min]) {
                    swaps++;
                    min = j;
                    
                }
            }
                swaps += 3;
                double temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
                
            }
            return new int[]{swaps, comparisons};
        }

        

    public static int[] insertionSort(double[] nums) {
        int swaps = 0;
        int comparisons = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            swaps++;
            double key = nums[i];
            int index = i - 1;

            while (index >= 0 && nums[index] > key) {
                comparisons++; 
                nums[index + 1] = nums[index];
                swaps++;
                index--;
            }

            nums[index + 1] = key;
            swaps++; // placing key
        }

        return new int[]{swaps, comparisons};
    }

    public static String leastSwaps(double[] nums) {
        double[] copy1 = nums.clone();
        double[] copy2 = nums.clone();
        double[] copy3 = nums.clone();

        int[] bubbleResult = bubbleSort(copy1);
        int[] selectionResult = selectionSort(copy2);
        int[] insertionResult = insertionSort(copy3);

        int bubbleSortSwap = bubbleResult[0];
        int selectionSortSwap = selectionResult[0];
        int insertionSortSwap = insertionResult[0];

        if (bubbleSortSwap <= selectionSortSwap && bubbleSortSwap <= insertionSortSwap) {
            return "Bubble";
        }
        else if (selectionSortSwap <= bubbleSortSwap && selectionSortSwap <= insertionSortSwap) {
            return "Selection";
        }        
        else {
            return "Insertion";
        }
    }
    public static String leastIterations(double[] nums) {
        double[] copy1 = nums.clone();
        double[] copy2 = nums.clone();
        double[] copy3 = nums.clone();

        int[] bubbleResult = bubbleSort(copy1);
        int[] selectionResult = selectionSort(copy2);
        int[] insertionResult = insertionSort(copy3);

        int bubbleSortSwap = bubbleResult[1];
        int selectionSortSwap = selectionResult[1];
        int insertionSortSwap = insertionResult[1];

        if (bubbleSortSwap <= selectionSortSwap && bubbleSortSwap <= insertionSortSwap) {
            return "Bubble";
        }
        else if (selectionSortSwap <= bubbleSortSwap && selectionSortSwap <= insertionSortSwap) {
            return "Selection";
        }        
        else {
            return "Insertion";
    }

	}
}