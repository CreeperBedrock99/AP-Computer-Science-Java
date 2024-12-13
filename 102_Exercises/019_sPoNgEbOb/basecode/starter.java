/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word you want to translate to sPoNgE cAsE: ");
		String sentence = sc.nextLine();
		
		while (true){
			if (sentence.indexOf(" ") == -1){
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(spongeCase(word));
            System.out.print(" ");
			sentence = sentence.substring(space + 1);
		}
	}
	
	public static String spongeCase(String word){
		String result = "";
		for (int i = 0; i < word.length(); i++){
			if (i % 2 == 0 || i == 0){
				word = word.toLowerCase();
				if (i + 1 == word.length()){
					result = result + word.substring(i);
				}else{
					result = result + word.substring(i, i + 1);
				}
			}else if (i % 2 != 0){
				word = word.toUpperCase();
				if (i + 1 == word.length()){
					result = result + word.substring(i);
				}else{
					result = result + word.substring(i, i + 1);
				}
			}
		}
		return result;
	}
}
