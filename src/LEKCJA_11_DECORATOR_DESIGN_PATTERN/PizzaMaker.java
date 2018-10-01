package LEKCJA_11_DECORATOR_DESIGN_PATTERN;
public class PizzaMaker {
	public static void main(String[] args){
		// The PlainPizza object is sent to the Mozzarella constructor
		// and then to the TomatoSauce constructor
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
		
                Pizza basicPizza2 = new Mozzarella(new TomatoSauce(new PlainPizza()));
                System.out.println("Ingredients: " + basicPizza2.getDescription());
		System.out.println("Price: " + basicPizza2.getCost());
                
                 
	}
	
}