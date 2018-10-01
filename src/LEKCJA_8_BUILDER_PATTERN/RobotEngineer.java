package LEKCJA_8_BUILDER_PATTERN;
// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)
public class RobotEngineer {

   private RobotBuilder robotBuilder;
   
   public RobotEngineer(RobotBuilder robotBuilder)
   {
       this.robotBuilder = robotBuilder;
   }
   // Return the Robot made from the OldRobotBuilder spec
   public Robot getRobot()
   {
       return this.robotBuilder.getRobot();
   }
   // Execute the methods specific to the RobotBuilder 
   // that implements RobotBuilder (OldRobotBuilder)
   public void makeRobot()
   {
       this.robotBuilder.buildRobotHead();
       this.robotBuilder.buildRobotArms();
       this.robotBuilder.buildRobotLegs();
       this.robotBuilder.buildRobotTorso();
   }
}
