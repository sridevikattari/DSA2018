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
			if (arr.length > 7) {
				sort(arr, l, m);

				sort(arr, m + 1, r);
			} else
				arr=selsort(arr);

			// Merge the sorted halves
			if (arr[m] < arr[m + 1])
				System.out.println("Array is already sorted. So, skipped the call to merge");
			else
				merge(arr, l, m, r);
		}
	}

	int[] selsort(int arr[]) {
		System.out.println("Insertion sort method invoked...");
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		System.out.print("[ ");
		for (int i = 0; i < n; ++i)
			{
				System.out.print(arr[i] + ",");
			}
		System.out.println("]"+"\n");
	}

	// Driver method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] ar = s.split(",");
			int arr[] = new int[ar.length];
			for (int i = 0; i < ar.length;)
				{
				arr[i] = Integer.parseInt(ar[i]);
				}

			System.out.println("Given Array");
			printArray(arr);

			Solution ob = new Solution();
			ob.sort(arr, 0, arr.length - 1);

			System.out.println("\nSorted array");
			printArray(arr);
			
		}
		sc.close();
	}
}

