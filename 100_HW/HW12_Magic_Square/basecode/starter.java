import pkg.*;

class starter {
	public static void main(String args[]) {
		int [] specialSquareArray = CVMath.specialSquare(5);
		System.out.println("The first " + specialSquareArray.length + " special squares are:");
		for (int i = 0; i < specialSquareArray.length; i++){
			System.out.println(specialSquareArray[i]);
		}
		System.out.println();
		System.out.println(CVMath.findMid(2,3,1));
	}
}
