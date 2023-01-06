package exercice1;

public class OfficeWorker extends Worker{
	
	private static double fuel = 150;
	
	public OfficeWorker(String name, String surname, double pricePerHour) {
		super(name, surname, pricePerHour);
		
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	@Override
	public double calculateSalary(int hours) {
		return (hours*pricePerHour) + fuel;
		
	}
	
	/**
	 * Does calculate the salary in old style
	 * @param hours
	 * @return salary
	 */
	@Deprecated
	public double oldCalculateSalary(int hours) {
		
		double foodTax = -150;
		
		return hours*pricePerHour + foodTax;
	}
	
	@Deprecated
	public void raiseSalary(int hours) {
		double bonus = 400;
		double salary = calculateSalary(hours) + bonus;
		System.out.println(salary);
		
		
	}

}
