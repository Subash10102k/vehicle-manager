public class Vehicle{
	
	public static main (String[] args) {
		 PetrolEngine pe = new PetrolEngine();
		 DieselEngine de = new DieselEngine();
		 ElectricMotor ee = new ElectricMotor();
		pe.start();
		pe.stops();
		
		de.start();
		de.stops();
	}
}