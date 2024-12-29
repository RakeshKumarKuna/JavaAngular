package com.atce;
import java.util.Arrays;
class DemoOne {
	public static void main(String args[]) {
		int arr[] = { 8, 7, 4, 2, 5, 2, 5, 7, 7 };
		int counter[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			counter[i] = count;
			count = 0;
		} // for
		System.out.println(Arrays.toString(counter));
         //geting max count from the counter array
		int max = 0;
		int index = 0;
		for (int i = 0; i < counter.length; i++) {
			if (max < counter[i]) {
				index = i;
				max = counter[i];
			}
		}
		System.out.println("max" + max);
		System.out.println("maximum repeated number is " + arr[index]);
	}
}