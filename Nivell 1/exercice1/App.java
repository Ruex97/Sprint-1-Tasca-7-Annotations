package exercice1;

public class App {

	public static void main(String[] args) {
		
		// I create an object of every class
		Worker myWorker = new Worker("Xavi", "Rue", 50);
		OnlineWorker myOnlineWorker = new OnlineWorker("Sara", "Rue", 50);
		OfficeWorker myOfficeWorker = new OfficeWorker("Pau", "Sanchez", 50);
		
		// I call the original method calculateSalary and both Overriteds. Seeing that the output
		// is different with same hours and pricePerHour, it's demonstrated it's been changed
		
		System.out.println("Your salary is " + myWorker.calculateSalary(40) + " euros");
		System.out.println("Your salary is " + myOnlineWorker.calculateSalary(40) + " euros");
		System.out.println("Your salary is " + myOfficeWorker.calculateSalary(40) + " euros");
		

	}

}
