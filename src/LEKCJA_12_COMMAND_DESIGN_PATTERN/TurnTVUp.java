package LEKCJA_12_COMMAND_DESIGN_PATTERN;

public class TurnTVUp implements Command{
ElectronicDevice theDevice;

public TurnTVUp(ElectronicDevice newDevice)
{
    theDevice = newDevice;
}
    @Override
    public void execute() {
       theDevice.volumeUp();
    }
    public void undo() {
        theDevice.volumeDown();
    }
}