/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey";
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf test = new PooleDwarf(randName(), 10);
		PooleDwarf test1 = new PooleDwarf(randName(), 5);
		PooleDwarf test2 = new PooleDwarf(randName(), 7);
		PooleDwarf test3 = new PooleDwarf(randName(), 36);
		PooleDwarf test4 = new PooleDwarf(randName(), 3);
		PooleDwarf test5 = new PooleDwarf(randName(), 48);
		PooleDwarf test6 = new PooleDwarf(randName(), 98);
		int maxNameCount = 0;
		int currentNameCount = 0;
		String currentName = "";
		String maxName = "";
		currentName = test.getName();
		if (test.getName() == test1.getName()){
			currentNameCount++;
		}
		if (test.getName() == test2.getName()){
			currentNameCount++;
		}
		if (test.getName() == test3.getName()){
			currentNameCount++;
		}
		if (test.getName() == test4.getName()){
			currentNameCount++;
		}
		if (test.getName() == test5.getName()){
			currentNameCount++;
		}
		if (test.getName() == test6.getName()){
			currentNameCount++;
		}
		maxNameCount = currentNameCount;
		maxName = currentName;
		currentNameCount = 0;
		currentName = test1.getName();
		if (test1.getName() == test2.getName()){
			currentNameCount++;
		}
		if (test1.getName() == test3.getName()){
			currentNameCount++;
		}
		if (test1.getName() == test4.getName()){
			currentNameCount++;
		}
		if (test1.getName() == test5.getName()){
			currentNameCount++;
		}
		if (test1.getName() == test6.getName()){
			currentNameCount++;
		}
		if (currentNameCount > maxNameCount){
			maxNameCount = currentNameCount;
			maxName = currentName;
		}
		currentNameCount = 0;
		currentName = test2.getName();
		if (test2.getName() == test3.getName()){
			currentNameCount++;
		}
		if (test2.getName() == test4.getName()){
			currentNameCount++;
		}
		if (test2.getName() == test5.getName()){
			currentNameCount++;
		}
		if (test2.getName() == test6.getName()){
			currentNameCount++;
		}
		if (currentNameCount > maxNameCount){
			maxNameCount = currentNameCount;
			maxName = currentName;
		}
		currentNameCount = 0;
		currentName = test3.getName();
		if (test3.getName() == test4.getName()){
			currentNameCount++;
		}
		if (test3.getName() == test5.getName()){
			currentNameCount++;
		}
		if (test3.getName() == test6.getName()){
			currentNameCount++;
		}
		if (currentNameCount > maxNameCount){
			maxNameCount = currentNameCount;
			maxName = currentName;
		}
		currentNameCount = 0;
		currentName = test4.getName();
		if (test4.getName() == test5.getName()){
			currentNameCount++;
		}
		if (test4.getName() == test6.getName()){
			currentNameCount++;
		}
		if (currentNameCount > maxNameCount){
			maxNameCount = currentNameCount;
			maxName = currentName;
		}
		currentNameCount = 0;
		currentName = test5.getName();
		if (test5.getName() == test6.getName()){
			currentNameCount++;
		}
		if (currentNameCount > maxNameCount){
			maxNameCount = currentNameCount;
			maxName = currentName;
		}
		System.out.println("There are " + maxNameCount + " duplicates.");
		System.out.print("The name was " + maxName + ".");
	}
}