/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int [] arr2 = new int[1001];
		 for (int i = 0; i <= 1000; i++){
		 	arr1[i] = 3 * i + 3;
		 	arr2[i] = 1000 - i;
		 }
		 for (int i = 0; i <= 1000; i++){
		 	System.out.println(arr1[i]);
		 }
		 System.out.println();
		 for (int i = 0; i <= 1000; i++){
		 	System.out.println(arr2[i]);
		 }
	}
}
