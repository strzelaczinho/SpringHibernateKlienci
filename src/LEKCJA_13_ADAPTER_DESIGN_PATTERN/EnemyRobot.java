package LEKCJA_13_ADAPTER_DESIGN_PATTERN;
// This is the Adaptee. The Adapter sends method calls
// to objects that use the EnemyAttacker interface
// to the right methods defined in EnemyRobot
import java.util.Random;

public class EnemyRobot {
    Random generator = new Random();
    
    public void smashWithHands()
    {
        int attackDamage = generator.nextInt(10)+1;
        
        System.err.println("Enemy Robot Causes "+attackDamage+" damage with his hands ");
    }
    public void walksForward()
    {
        int movement = generator.nextInt(5)+1;
        System.err.println("Enemy Robot Walks Forward "+movement+" Spaces");
    }
    
    public void reactToHuman(String driverName)
    {
        System.err.println("Enemy Robot Tramps on "+driverName);
    }
}
