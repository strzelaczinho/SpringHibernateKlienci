/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LEKCJA_5_FACTORY_DESIGN_PATTERN;
import java.util.Scanner;
public class EnemyShipTesting {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        System.out.println("What type of ship? (U/R/B");
        if(sc.hasNextLine())
        {
            String typStatku = sc.nextLine().toUpperCase();
            theEnemy = shipFactory.makeEnemyShip(typStatku);
        }
        if(theEnemy != null)
                {
                     doStuffEnemy(theEnemy);
                }
        else
        {
            System.out.println("Enter a U , R , B next time ");
        }

        
        // bad stuff
        
        
        
//        EnemyShip theEnemy = null;
//        
//        Scanner sc = new Scanner(System.in);
//        String enemyShipOption = "";
//        System.out.print("What type of ship? (U/R)");
//        if (sc.hasNextLine())
//        {
//            enemyShipOption = sc.nextLine().toUpperCase();
//        }
//        if (enemyShipOption.equals("U"))
//        {
//            theEnemy = new UfoEnemyShip();
//        }else
//        {
//            theEnemy = new RocketEnemyShip();
//        }
//            
//        doStuffEnemy(theEnemy);
        
        
        
    }
    public static void doStuffEnemy(EnemyShip anEnemyShip)
    {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
