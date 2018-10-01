package LEKCJA_13_ADAPTER_DESIGN_PATTERN;
import java.util.Random;

public class EnemyTank implements EnemyAttacker{
Random generator = new Random();
    @Override
    public void fireWeapon() {
      int attackDamage =  generator.nextInt(10)+1;
        System.err.println("Enemy tank does "+attackDamage+" damage");
    }
    @Override
    public void driveForward() {
       int movement = generator.nextInt(5)+1;
        System.err.println("Enemy tank moves "+movement+" spaces");
    }
    @Override
    public void assignDriver(String driverName) {
        System.err.println(driverName+" is driving a tank");
    }
    
}
// EnemyTank implements EnemyAttacker perfectly
// Our job is to make classes with different methods
// from EnemyAttacker to work with the EnemyAttacker interface