package zoo;

/**
 * A wrapper around a main method used to test the Zoo class.
 * @author Foo Barstein
 * @version 2
 */
public class MakeSomeZoos {

	public static void main(String[] args) {
		
		//make a zoo object
		Zoo bronxZoo = new Zoo();
		
		//set the name of the zoo
		bronxZoo.setName("Bronx Zoo");
		
		//create an array of animals at the zoo
		String[] animals = {
				"lemurs",
				"koalas",
				"platypus",
				"raccoons",
				"pythons"
		};
		
		//set these as the zoo's animals
		bronxZoo.setAnimals(animals);

		//create an array of opening hours for each day
		int[][] hours = {
				{9, 18}, //monda
				{9, 18}, //tuesday
				{9, 18}, //weds
				{9, 18}, //thurs
				{9, 18}, //fri
				{9, 18} //sat
				//closed on SUNDAY
		};		

		//set the zoo's hours
		bronxZoo.setHours(hours);
		
		//set the zoo's number of employees
		bronxZoo.setNumberOfEmployees(10000);
		
		//set the zoo's operating budget
		bronxZoo.setOperatingBudget(15000000);
		
		// set the percentage of the operating budget that is saved for pensions to 20%
		bronxZoo.setFractionOfBudgetGoingToPensions(0.2);
		
		//make an address object for the zoo
		Address address = new Address();
		address.setCity("New York");
		address.setStreet1("Moshulu Parkway");
		address.setState("New York"); //this is the only one we're validating at this point
		address.setZip(10460);
		
		//set this address as the zoo's address
		bronxZoo.setAddress(address);
		
		//output some information about this zoo
		System.out.printf("The %s, located at %s in %s has an operating budget of %d and %d employees.\n", 
				bronxZoo.getName(), 
				bronxZoo.getAddress().getStreet1(), 
				bronxZoo.getAddress().getCity(), 
				bronxZoo.getOperatingBudget(), 
				bronxZoo.getNumberOfEmployees());

	}

}
