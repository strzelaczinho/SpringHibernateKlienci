package LEKCJA_12_COMMAND_DESIGN_PATTERN;
// To jest Reciver
public class Television implements ElectronicDevice{
    private int volume = 0;
    @Override
    public void on() {
        System.err.println("TV is ON");
    }
    @Override
    public void off() {
        System.err.println("TV is OFF");
    }
    @Override
    public void volumeUp() {
       System.err.println("TV volume is at "+volume);
       volume++;
    }
    @Override
    public void volumeDown() {
        volume--;
         System.err.println("TV volume is at "+volume);
     
    }
    
}
