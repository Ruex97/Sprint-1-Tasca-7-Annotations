package exercice1;

public class OnlineWorker extends Worker{
	
	private final double INTERNET;
	
	public OnlineWorker(String name, String surname, double pricePerHour) {
		super(name, surname, pricePerHour);
		INTERNET = 50;
		
	}

	@Override
	public double calculateSalary(int hours) {

		return hours*pricePerHour + INTERNET;

	}
	
	/**
	 * Does calculate the salary in old style
	 * @param hours
	 * @return salary
	 */
	@Deprecated
	public double oldCalculateSalary(int hours) {
		
		double onlineBonus = 400;
		return hours*pricePerHour + onlineBonus;
	}
	
	
	@Deprecated
	public void raiseSalary(int hours) {
		double bonus = 400;
		double salary = calculateSalary(hours) + bonus;
		System.out.println(salary);
		
		
	}

	
	
	

}
