package qn1_median_number;

import java.util.Arrays;

public class MedianNumber {

	

	public void medianNumber(double[] arr) {

		Arrays.sort(arr);

		double median;
		int n;
		n = arr.length;

		// if there are even numbers in array,
		// median is mean of 2 center number
		if (n % 2 == 0) {
			median = (arr[(n / 2 - 1)] + arr[n / 2]) / 2;
		} else {
			median = arr[((n + 1) / 2 - 1)];
		}
		System.out.println("Median is " + median);
	}
}
