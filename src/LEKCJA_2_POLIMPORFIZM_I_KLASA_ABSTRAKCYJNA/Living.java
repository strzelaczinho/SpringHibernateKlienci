package LEKCJA_2_POLIMPORFIZM_I_KLASA_ABSTRAKCYJNA;

public interface Living {
    public void setName(String newName);
    public String getName();
    
    public void setHeight(double newHeight);
    public double getHeight();
    
    public void setWeight(double newWeight);
    public double getWeight();
    
    public void setFavFodd(String newFood);
    public String getFavFod();
    
    public void setSpeed(double newSpeed);
    public double getSpeed();
    
    public void setSound(String newSound);
    public String getSound();
    
}
