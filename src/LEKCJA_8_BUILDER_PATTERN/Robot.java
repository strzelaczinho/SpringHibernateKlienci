package LEKCJA_8_BUILDER_PATTERN;
public class Robot implements RobotPlan{
private String robotHead;
private String robotTorso;
private String robotArms;
private String robotLegs;
// The concrete Robot class based on the RobotPlan interface

    public String getRobotHead() {
        return robotHead;
    }
    public String getRobotTorso() {
        return robotTorso;
    }
    public String getRobotArms() {
        return robotArms;
    }
    public String getRobotLegs() {
        return robotLegs;
    }
    @Override
    public void setRobotHead(String head) {
       robotHead = head;
    }
    @Override
    public void setRobotTorso(String torso) {
       robotTorso = torso;
    }
    @Override
    public void setRobotArms(String arms) {
        robotArms = arms;
    }
    @Override
    public void setRobotLegs(String legs) {
        robotLegs = legs;
    }
    public String toString()
    {
        return "Wlasna metoda dla sprawdzenia poprawnosci"+getRobotArms();
    }
    
}
