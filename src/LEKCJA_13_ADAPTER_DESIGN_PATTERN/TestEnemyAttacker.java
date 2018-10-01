package LEKCJA_13_ADAPTER_DESIGN_PATTERN;
public class TestEnemyAttacker {
    public static void main(String[]args)
    {
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        System.err.println("Robot ----------");
        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.smashWithHands();
        fredTheRobot.walksForward();
        
        System.err.println("The Enemy Tank -----------");
        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        
        System.err.println("The Robot with Adapter ----------");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
        
        
    }
}
