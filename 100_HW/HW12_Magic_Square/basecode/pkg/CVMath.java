package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static int [] specialSquare(int numSquares){
		int [] arr = new int[numSquares];
		int squared = 1;
		for (int i = 0; i < arr.length; i++){
			while (true){
				int checkSpecial = 0;
				int square = squared * squared;
				for (int x = 1; checkSpecial < square; x++){
					checkSpecial += x;
				}
				if(checkSpecial == square){
					arr[i] = checkSpecial;
					squared++;
					break;
				}else{
					squared++;
				}
			}
		}
		return arr;
	}
}
