package LEKCJA_26_VISITOR_DESIGN_PATTERN;
class Liquor implements Visitable {
	
	private double price;

	Liquor(double item)
        {
		price = item;
	}

	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
	
}