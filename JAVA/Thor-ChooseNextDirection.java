import java.util.*;
import java.io.*;
import java.math.*;


/*Obj : Donner les coordonnées X et Y du prochain deplacement */

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            int x =  lightX - initialTX;
            int y =  lightY - initialTY;
            
            String dir = "";
            
            if (x > 0 && y > 0) 
                {
                    dir = "SE";
                    initialTX += 1;
                    initialTY += 1;
                }
                
            else if (x < 0 && y > 0)
                {
                    dir = "SW";
                    initialTX -= 1;
                    initialTY += 1;
                }
            else if (x == 0 && y > 0)
                {
                    dir = "S";
                    initialTY += 1;
                }
                
            else if (x < 0 && y == 0)
                {
                    dir = "W";
                    initialTX -= 1;
                }
            
            else if (x > 0 && y == 0)
                {
                    dir = "E";
                    initialTX += 1;
                }
                
            else if (x == 0 && y < 0)
                {
                    dir = "N";    
                    initialTY -= 1;
                }
                
            else if (x < 0 && y < 0)
                {
                    dir = "NW";
                    initialTX -= 1;
                    initialTY -= 1;
                }
                
            else if (x > 0 && y < 0)
                {
                    dir = "NE";
                    initialTX += 1;
                    initialTY -= 1;
                }
        
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(dir);
        }
    }
}