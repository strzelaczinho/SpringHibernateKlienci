/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LEKCJA_23_INTERPRETER_PATTERN;

public class Quarts extends Expression{

	public String gallons(double quantity) {
		
		return Double.toString(quantity/4);
	}

	public String quarts(double quantity) {
		return Double.toString(quantity);
	}

	public String pints(double quantity) {
		return Double.toString(quantity*2);
	}

	public String cups(double quantity) {
		return Double.toString(quantity*4);
	}

	public String tablespoons(double quantity) {
		return Double.toString(quantity*64);
	}
	
}