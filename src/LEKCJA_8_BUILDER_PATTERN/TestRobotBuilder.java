package LEKCJA_8_BUILDER_PATTERN;

public class TestRobotBuilder {
    public static void main (String[]args)
    {
       // Get a RobotBuilder of type OldRobotBuilder
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		// Pass the OldRobotBuilder specification to the engineer
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
        // Tell the engineer to make the Robot using the specifications
	// of the OldRobotBuilder class
        robotEngineer.makeRobot();
        // The engineer returns the right robot based off of the spec
	// sent to it on line 11
        Robot firstRobot = robotEngineer.getRobot(); // zwroci obiekt robota ktory zostal przekazany inzynierowi
        
        System.out.println("Robot Build");
        System.out.println("Robot Head type "+firstRobot.getRobotHead());
        System.out.println("Robot Torso type "+firstRobot.getRobotTorso());
        System.out.println("Robot Arms type "+firstRobot.getRobotArms());
        System.out.println("Robot Legs type "+firstRobot.getRobotLegs());
        System.out.println(firstRobot.toString());
    }
}
