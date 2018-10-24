import java.util.Arrays;
import java.util.Scanner;

/* Java program for Merge Sort */
class Solution {
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			if (m - l > 7) {
				sort(arr, l, m);
			} else
				arr = inssort(arr, l, m);
			if (r - (m + 1) > 7)
				sort(arr, m + 1, r);
			else
				arr = inssort(arr, m + 1, r);

			// Merge the sorted halves
			if (arr[m] < arr[m + 1]) {
				System.out.println("Array is already sorted. So, skipped the call to merge");
				String s[] = new String[3];
				Solution.main(s);
			} else {
				merge(arr, l, m, r);
				printArray(arr);
			}
		}
	}

	/* Function to sort array using insertion sort */
	int[] inssort(int arr[], int s, int n) {

		for (int i = s + 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one
			 * position ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		// System.out.println("inssort:"+Arrays.toString(arr));
		return arr;
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

	// Driver method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while (sc.hasNextLine()) {

			// System.out.println("s:"+s);
			if (s.isEmpty())
				break;
			String[] ar = s.split(",");
			int arr[] = new int[ar.length];
			for (int i = 0; i < ar.length; i++) {
				arr[i] = Integer.parseInt(ar[i]);
			}

			// System.out.println("Given Array"+Arrays.toString(arr));

			Solution ob = new Solution();
			ob.sort(arr, 0, arr.length - 1);
			s = sc.nextLine();
			// System.out.println("\nSorted array");
			// printArray(arr);

		}
		sc.close();
	}
}
