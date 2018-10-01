
package LEKCJA_24_MEDIATOR_DESIGN_PATTERN;

public interface Mediator {
	
	public void saleOffer(String stock, int shares, int collCode);
	public void buyOffer(String stock, int shares, int collCode);
	public void addColleague(Colleague colleague);
	
}