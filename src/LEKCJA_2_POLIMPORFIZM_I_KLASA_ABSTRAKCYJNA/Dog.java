/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LEKCJA_2_POLIMPORFIZM_I_KLASA_ABSTRAKCYJNA;


/**
 *
 * @author adam
 */
public class Dog extends Animal{
    public void digHole()
    {
        System.out.println("Kopie dziure");
    }
    public Dog()
    {
        super();
        
        setSound("Bark");
    }
    public void changeVar(int randNum)
    {
        randNum = 12;
        System.out.println("randNum in method "+randNum);
    }
     public void accessPrivate()
    {
        bePrivate(); //z publicznej metody jestesmy w stanie dotrzec do metody prywatnej
    }
    private void bePrivate()
    {
        System.out.println("In a private method");
    }
    
}
