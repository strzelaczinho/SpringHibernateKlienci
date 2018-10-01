package LEKCJA_12_COMMAND_DESIGN_PATTERN;

public class TVRemote {
    public static ElectronicDevice getDevice(){
        
        return new Television();
    }
}
