/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;

class starter {
	public static String translateToPigLatin(String english){
		String [] vowels = new String[] {"a", "e", "i", "o", "u"};
		String pigLatin = "";
		boolean index1 = false;
		boolean index2 = false;
		for (int i = 0; i < vowels.length; i++){
			if (vowels[i].equals(english.substring(0,1))){
				index1 = true;
				break;
			}else if (english.length() > 2){
				if (vowels[i].equals(english.substring(1,2))){
					index2 = true;
					break;
				}
			}
		}
		if (index1 || english.length() == 1){
			pigLatin = english + "-way";
		}else if (english.length() >= 2){
			if (index1){
				pigLatin = english + "-way";
			}else if (index2 || english.length() == 2){
				pigLatin = english.substring(1) + "-" + english.substring(0, 1) + "ay";
			}else{
				pigLatin = english.substring(2) + "-" + english.substring(0, 2) + "ay";
			}
		}
		return pigLatin;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a string you want to translate into Pig Latin. (Don't include any ending punctuation or else yout sentence will print out wrong)");
		String sentence = sc.nextLine();
		while (true){
            if (sentence.indexOf(" ") == -1){
                System.out.print(translateToPigLatin(sentence));
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            System.out.print(translateToPigLatin(word));
            System.out.print(" ");
            sentence = sentence.substring(space + 1);
        }
	}
}
