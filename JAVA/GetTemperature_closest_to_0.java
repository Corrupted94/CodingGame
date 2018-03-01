import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int closestToZero = Integer.MAX_VALUE;
      
        if (n !=0)
        {
            for (int i = 0; i < n; i++) {
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            
                if (Math.abs (closestToZero) > Math.abs(t)) closestToZero = t;
            
                //Dans le cas où on a par exemple +5 et -5, on veut toujours prendre +5 (énoncé)
                else if (Math.abs (closestToZero) == Math.abs(t)) closestToZero = t > closestToZero ? t : closestToZero;
            
            }

            System.out.println(closestToZero);
        }
        
        else System.out.println(0);
        


    }
}