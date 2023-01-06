package exercice1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> Menu = new ArrayList<>();
		Menu.add("Cocacola");
		Menu.add("fries");
		Menu.add("Burguer");
		Menu.add("Nuggets");
		Menu.add("Pizza");
		Menu.add("Salad");
		
		
		serialize(Menu);
		
		

	}
	
	@SerializeToJson(destination = "C:\\\\Users\\\\xavir\\\\Desktop\\\\testdir\\\\jsontest.json")
	static void serialize(ArrayList<String> Menu) {
		Serializator.SerializeArrayList(Menu);
		
	}
	

}

