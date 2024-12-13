/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String decipher1 = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
		String decipher2 = Cipher.encode("sv8vq17r 1r q25 85rq");
		String decipher3 = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
		String decipher4 = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
		String decipher5 = Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
		String decipher6 = Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 17 / 2);
		String decipher7a = Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13);
		String decipher7b = Cipher.keyedEncode(decipher7a, 29);
		String decipher8 = Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw");
		String decipher9 = Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27);
		String decipher10 = Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16);
		System.out.println(decipher1);
		System.out.println(decipher2);
		System.out.println(decipher3);
		System.out.println(decipher4);
		System.out.println(decipher5);
		System.out.println(decipher6);
		System.out.println(decipher7b);
		System.out.println(decipher8);
		System.out.println(decipher9);
		System.out.println(decipher10);
		System.out.println("");
		
		System.out.print("Enter a message you want to encode: ");
		String secret = sc.nextLine();
		System.out.print("Do you want to add a key? (y/n): ");
		String addKey = sc.nextLine();
		int keyInt = 0;
		while (!addKey.equals("No") || !addKey.equals("no") || !addKey.equals("N") || !addKey.equals("n")){
			if (addKey.equals("Yes") || addKey.equals("yes") || addKey.equals("Y") || addKey.equals("y")){
				System.out.print("Enter a number between 1 and 36 you want as your key: ");
				keyInt = sc.nextInt();
				if (keyInt > 36){
					System.out.print("That number is too high. Please try again: ");
					keyInt = sc.nextInt();
				}else if (keyInt <= 0){
					System.out.print("That number is too low. Please try again: ");
					keyInt = sc.nextInt();
				}else{
					break;
				}
			}else if (addKey.equals("No") || addKey.equals("no") || addKey.equals("N") || addKey.equals("n")){
				System.out.println("No key will be added. Thank you for your input.");
				break;
			}else{
				System.out.print("Incorrect input; please enter if you want to or don't want to add a key with yes or no: ");
				addKey = sc.nextLine();
			}
		}
		String encodedString = "";
		if (keyInt == 0){
			encodedString = Cipher.encode(secret);
		}else{
			encodedString = Cipher.keyedEncode(secret, keyInt);
		}
		System.out.println("Your coded message is: " + encodedString);
		if (keyInt == 0){
			encodedString = Cipher.encode(encodedString);
		}else{
			encodedString = Cipher.keyedEncode(encodedString, keyInt);
		}
		System.out.println("Your coded message is: " + encodedString);
		System.out.println("");
		
		String forPoole = Cipher.keyedEncode("Mr Pooles class is the best and you cant deny it XD", 27);
		System.out.println("Guess the key to decipher this code: " + forPoole);
		int keyGuess = sc.nextInt();
		sc.nextLine();
		while (keyGuess != 27){
			if (keyGuess == 27){
				break;
			}else{
				System.out.print("You guessed the wrong key. try again: ");
				keyGuess = sc.nextInt();
				sc.nextLine();
			}
		}
		System.out.println("You guessed the correct code! Here is the deciphered message:");
		System.out.println(Cipher.keyedEncode(forPoole, 27));
	}
}
