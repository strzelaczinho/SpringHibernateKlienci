package LEKCJA_1_KLASA_ANIMAL;

public class Animal {
    private String name;
    private int weight;
    private String sound;
    
     public void setName(String newname){ name = newname; }
     public void setWeight(int newWeight)
    {
        if (newWeight > 0)
        {
            weight = newWeight;
        }
        else 
        {
            System.out.println("Wieght must be bigger than 0");
        }
    }
    
    public void setSound(String newsound) {sound = newsound;}
    public int getWeight(){ return weight;}
    public String getName(){return name;}
    
}
