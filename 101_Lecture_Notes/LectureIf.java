/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lebron is starting his journey to become the sun!");
        System.out.println("What way would you like him to become the sun?");
        System.out.println("1. He meditates on the court during a game.");
        System.out.println("2. He performs an ancient locker ritual.");
        System.out.println("3. He sees a vision from a basketball god.");
        int answer = sc.nextInt();
        if (answer == 1){
            System.out.print("Lebron meditates on the court, but gets hit by a basketball and comes unconscious.");
        }else if (answer == 2){
            System.out.print("Lebron performs the ritual, and in succession, becomes the sun.");
        }else if (answer == 3){
            System.out.print("Lebron sees a vision from a basketball god, but it only shows him winning his next game.");
        }else{
            System.out.print("Invalid input");
        }
	}
}