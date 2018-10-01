/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LEKCJA_23_INTERPRETER_PATTERN;

public class Pints extends Expression{

	public String gallons(double quantity) {
		
		return Double.toString(quantity/8);
	}

	public String quarts(double quantity) {
		return Double.toString(quantity/2);
	}

	public String pints(double quantity) {
		return Double.toString(quantity);
	}

	public String cups(double quantity) {
		return Double.toString(quantity*2);
	}

	public String tablespoons(double quantity) {
		return Double.toString(quantity*32);
	}
	
}