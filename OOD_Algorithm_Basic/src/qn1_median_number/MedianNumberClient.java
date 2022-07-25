package qn1_median_number;

public class MedianNumberClient {

	public static void main(String[] args) {
		MedianNumber method = new MedianNumber();
		double[] arr1 = { 7.4, 3.9, 1.2, 9.7, 2.3, 8.2 };
		method.medianNumber(arr1);
		double[] arr2 ={7.4, 3.9, 1.2, 9.7, 2.3};
		method.medianNumber(arr2);
 	}
}
