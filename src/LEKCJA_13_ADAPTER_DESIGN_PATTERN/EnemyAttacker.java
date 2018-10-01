package LEKCJA_13_ADAPTER_DESIGN_PATTERN;
public interface EnemyAttacker {
    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);
    
}
// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new 
// classes compatible with this one.