
package LEKCJA_9_PROTOTYPE_DESIGN_PATTERN;

public class Jez implements Animal {
	public Jez(){
		
		System.out.println("Jez is Made");
	}
	public Animal makeCopy() {
		System.out.println("Jez is Being Made");
		Jez jez = null;
		try {
			// Calls the Animal super classes clone()
			// Then casts the results to Sheep
			
			jez = (Jez) super.clone();
		}
		// If Animal didn't extend Cloneable this error 
		// is thrown
		catch (CloneNotSupportedException e) {
			System.out.println("The Sheep was Turned to Mush");
			e.printStackTrace();
		 }
		return jez;
	}
	public String toString(){
		return "Jez to moj bohater";
	}
}