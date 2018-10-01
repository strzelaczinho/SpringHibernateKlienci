
package LEKCJA_16_TEMPLATE_METHOD_DESIGN_PATTERN;

public class VeggieHoagie extends Hoagie{
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

boolean customerWantsMeat() {return false;} //as a hook
boolean customerWantsCheese(){return false;}
    @Override
    void addMeat() {
      
    }

    @Override
    void addCheese() {
        
    }

    @Override
    void addVegetables() {
      System.out.println("Adding the Veggies: ");
        for (String veggie: veggiesUsed)
        {
            System.out.println(veggie +" ");
        }
    }

    @Override
    void addCondiments() {
     System.out.println("Adding the Condiments: ");
        for (String condi: condimentsUsed)
        {
            System.out.println(condi +" ");
        }
    }
    
 
}