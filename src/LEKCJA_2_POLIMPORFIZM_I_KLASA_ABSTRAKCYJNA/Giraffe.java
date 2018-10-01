package LEKCJA_2_POLIMPORFIZM_I_KLASA_ABSTRAKCYJNA;
public class Giraffe extends Creature{

        private String name;
    @Override
    public void setName(String newname) {
        name = newname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(double newWeight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
