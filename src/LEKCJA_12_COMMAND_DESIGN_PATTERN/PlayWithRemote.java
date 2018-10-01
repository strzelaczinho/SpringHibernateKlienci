package LEKCJA_12_COMMAND_DESIGN_PATTERN;
import java.util.ArrayList;
import java.util.List;
public class PlayWithRemote {
    public static void main(String[]args)
    {
        ElectronicDevice newDevice = TVRemote.getDevice();
                // TurnTVOn contains the command to turn on the tv
		// When execute() is called on this command object
		// it will execute the method on() in Television
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);// Calling the execute() causes on() to execute in Television
        
        onPressed.press();// When press() is called theCommand.execute(); executes
        
        TurnTVOff offCommand = new TurnTVOff(newDevice);// Now when execute() is called off() of Television executes
        onPressed = new DeviceButton(offCommand);// Calling the execute() causes off() to execute in Television
        onPressed.press(); // nie obchodzi jaki rodzaj COmmandu wykonanmy . Wykonuje
        
         TurnTVUp upCommand = new TurnTVUp(newDevice);
         onPressed = new DeviceButton(upCommand);
         onPressed.press(); // nie obchodzi jaki rodzaj COmmandu wykonanmy . Wykonuje
         onPressed.press();
         onPressed.press();
         
         Television TheTv = new Television();// Creating a TV and Radio to turn off with 1 press
         Radio theRadio = new Radio();
         
         List<ElectronicDevice> allDevices  = new ArrayList<ElectronicDevice>();
         allDevices.add(TheTv);
         allDevices.add(theRadio);// Add the Electronic Devices to a List
         
         TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
         DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
         turnThemOff.press();
         
         turnThemOff.pressUndo();
         /*
		 * It is common to be able to undo a command in a command pattern
		 * To do so, DeviceButton will have a method called undo
		 * Undo() will perform the opposite action that the normal
		 * Command performs. undo() needs to be added to every class
		 * with an execute()
		 */
                 // To undo more than one command add them to a LinkedList
		// using addFirst(). Then execute undo on each item until 
		// there are none left. (This is your Homework)
    }
}
