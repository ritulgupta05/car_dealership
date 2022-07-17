package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer("Ritul", "Moth(Jhansi)", 1500000);
		
		Vehicle vehicle = new Vehicle("BMW", "M3",4000000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		Vehicle car = new Vehicle("BMW", "M3",4000000);
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
			
		

	}

}
