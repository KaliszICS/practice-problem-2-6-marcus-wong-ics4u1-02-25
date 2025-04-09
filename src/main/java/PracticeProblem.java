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
                result[1]++; 
                if (nums[j] > nums[j + 1]) {
                    double temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    result[0] += 3; 
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
        return result;
    }

    public static int[] selectionSort(double[] nums) {
        int[] result = new int[2]; 
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                result[1]++; 
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) { 
                double temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
                result[0] += 5; 
            }
        }
        return result;
    }

	public static int[] insertionSort(double[] nums) {
		int[] result = new int[2];
		int n = nums.length;
	
		for (int i = 1; i < n; i++) {
			double key = nums[i];
			int index = i - 1;
			while (index >= 0) {
				result[1]++;
				if (nums[index] > key) {
					nums[index + 1] = nums[index];
					result[0] += 2; 
					index--;
				} else {
					break;
				}
			}
			nums[index + 1] = key; 
			result[0] += 1; 
		}
		return result;
	}

    public static String leastSwaps(double[] nums) {
        double[] copy1 = nums.clone();
        double[] copy2 = nums.clone();
        double[] copy3 = nums.clone();

        int[] bubbleResult = bubbleSort(copy1);
        int[] selectionResult = selectionSort(copy2);
        int[] insertionResult = insertionSort(copy3);

        if (bubbleResult[0] <= selectionResult[0] && 
            bubbleResult[0] <= insertionResult[0]) {
            return "Bubble";
        } else if (selectionResult[0] <= insertionResult[0]) {
            return "Selection";
        } else {
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

        if (bubbleResult[1] <= selectionResult[1] && 
            bubbleResult[1] <= insertionResult[1]) {
            return "Bubble";
        } else if (selectionResult[1] <= insertionResult[1]) {
            return "Selection";
        } else {
            return "Insertion";
        }
    }

	}