/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        greeting("Matthew");
        greeting("Amberdingus");
        greeting("Taqqurias#");
        double newSalary = raise(6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        newSalary = raise(newSalary+6000, 6);
        System.out.println(newSalary);
	}
	private static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	public static void greeting(String name){
	    System.out.println("Hello, " + name);
	}
	public static void printAnimal(){
	    System.out.println("|\\---/|");
	    System.out.println("| o_o |");
	    System.out.println(" \\_^_/");
	}
}