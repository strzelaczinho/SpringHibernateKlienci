
package LEKCJA_24_MEDIATOR_DESIGN_PATTERN;

public abstract class Colleague {
    private Mediator mediator;
    private int colleageCode;
    
    public Colleague(Mediator newMediator)
    {
        mediator = newMediator;
    }
    public void saleOffer(String stock,int shares)
    {
        mediator.saleOffer(stock,shares,this.colleageCode);
    }
     public void buyOffer(String stock,int shares)
    {
        mediator.buyOffer(stock,shares,this.colleageCode);
    }
     public void setCollCode(int collCode)
     {
         colleageCode = collCode;
     }
}

