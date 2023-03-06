public class Vehicle{
	
	public class PetrolEngine{
		public static void start() {
			System.out.println("Engine starting");
		}
	}
	
	public static main (String[] args) {
		 PetrolEngine pe = new PetrolEngine();
		
		pe.start();
	}
}