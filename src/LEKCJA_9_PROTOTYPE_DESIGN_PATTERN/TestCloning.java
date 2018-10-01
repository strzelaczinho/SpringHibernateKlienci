package LEKCJA_9_PROTOTYPE_DESIGN_PATTERN;
public class TestCloning {
	public static void main(String[] args){
		// Handles routing makeCopy method calls to the 
		// right subclasses of Animal
		CloneFactory animalMaker = new CloneFactory();
		// Creates a new Sheep instance
		Sheep sally = new Sheep();
		// Creates a clone of Sally and stores it in its own
		// memory location
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		// These are exact copies of each other
		System.out.println(sally);
		System.out.println(clonedSheep);
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
                
                
                Jez jez = new Jez();
                
                Jez sklonowanyJez = (Jez) animalMaker.getClone(jez);
                System.err.println(jez);
                System.err.println(sklonowanyJez);
             
	}
}
