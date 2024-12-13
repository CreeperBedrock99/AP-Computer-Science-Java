package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String whatName){
		name = whatName;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String whatName, String whatBreed){
		name = whatName;
		age = 1;
		breed = whatBreed;
	}
	public Dog(String whatName, int whatAge){
		name = whatName;
		age = whatAge;
		breed = "dog dog";
	}
	
	public void setName(String nameOfDog){
		name = nameOfDog;
	}
	public void setAge(int ageOfDog){
		age = ageOfDog;
	}
	public void setBreed(String breedOfDog){
		breed = breedOfDog;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		int sleep = (int)(Math.random() * 2);
		if (sleep == 0){
			return true;
		}else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " is barking!");
	}
}
