/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] x){
		for (int i = 0; i < 100; i++){
			System.out.println(x[i]);
		}
		return;
	}
	
	public static int getAverageArray(int[] y){
		int average = 0;
		for (int i = 0; i < 100; i++){
			average = average + y[i];
		}
		average = average / 100;
		return average;
	}
	
	public static int getArrayMax(int[] h){
		int max = Integer.MAX_VALUE;
		max = 0;
		for (int i = 0; i < 100; i++){
			if (h[i] > max){
				max = h[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int[] l){
		int min = Integer.MAX_VALUE;
		min = 100;
		for (int i = 0; i < 100; i++){
			if (l[i] < min){
				min = l[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		int [] arr = new int[100];
		for (int i = 0; i < 100; i++){
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		toStringArray(arr);
		System.out.println("The average of the array is " + getAverageArray(arr));
		System.out.println("The maximum value in your array is " + getArrayMax(arr));
		System.out.println("The minimum value in your array is " + getArrayMin(arr));
	}
}
