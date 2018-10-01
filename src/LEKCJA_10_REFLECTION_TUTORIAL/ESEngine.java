package LEKCJA_10_REFLECTION_TUTORIAL;

// Any part that implements the interface ESEngine

import LEKCJA_6_ABSTRACT_FACTORY_PATTERN.*;
// Any part that implements the interface ESEngine
// can replace that part in any ship

public interface ESEngine{

	// User is forced to implement this method
	// It outputs the string returned when the 
	// object is printed
	
	public String toString();

}