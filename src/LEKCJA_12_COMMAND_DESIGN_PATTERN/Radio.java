
package LEKCJA_12_COMMAND_DESIGN_PATTERN;

public class Radio implements ElectronicDevice{

      private int volume = 0;
    @Override
    public void on() {
        System.err.println("Radio is ON");
    }
    @Override
    public void off() {
        System.err.println("Radio is OFF");
    }
    @Override
    public void volumeUp() {
       System.err.println("Radio volume is at "+volume);
       volume++;
    }
    @Override
    public void volumeDown() {
        volume--;
         System.err.println("Radio volume is at "+volume);
     
    }
    
}
