/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int x = 0;
		while (x < 1000){
			arr[x] = (int)(Math.random() * 1000);
			System.out.println(arr[x]);
			x++;
		}
	}
}
