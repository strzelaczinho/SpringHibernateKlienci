package LEKCJA_12_COMMAND_DESIGN_PATTERN;
import java.util.List;

public class TurnItAllOff implements Command
{
List<ElectronicDevice> theDevices;
public TurnItAllOff(List<ElectronicDevice> newDevices)
{
   theDevices = newDevices;
}
    @Override
    public void execute() {
        for (ElectronicDevice device:theDevices)
        {
            device.off();
        }
    }
   public void undo() {
        for (ElectronicDevice device:theDevices)
        {
            device.on();
        }
    }
  
}
