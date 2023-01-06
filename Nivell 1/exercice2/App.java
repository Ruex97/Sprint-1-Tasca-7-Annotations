package exercice2;

import exercice1.OfficeWorker;
import exercice1.OnlineWorker;
public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		OnlineWorker myOnlineWorker = new OnlineWorker("Sara", "Rue", 50);
		OfficeWorker myOfficeWorker = new OfficeWorker("Pau", "Sanchez", 50);
		
		
		//Suppressing the warning deprecation, we can call deprecated methods as if they weren't.
		//Also we can still call the other methods.
		
		System.out.println("Your salary is " + myOnlineWorker.oldCalculateSalary(40) + " euros");
		System.out.print("Your salary is "); myOfficeWorker.raiseSalary(40);
		System.out.println("Your salary is " + myOfficeWorker.calculateSalary(40) + " euros");

	}
	
	

}
