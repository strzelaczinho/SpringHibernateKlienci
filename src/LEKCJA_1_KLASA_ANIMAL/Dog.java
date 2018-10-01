/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LEKCJA_1_KLASA_ANIMAL;

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
    
}
