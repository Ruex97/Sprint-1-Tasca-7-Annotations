package exercice1;

public class Worker {
	
	protected String name;
	protected String surname;
	protected double pricePerHour;
	
	public Worker(String name, String surname, double pricePerHour) {
		this.name = name;
		this.surname = surname;
		this.pricePerHour = pricePerHour;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	public double calculateSalary(int hours) {

		return hours*pricePerHour;

	}
	
	


}
