import java.util.*;
import java.io.*;
import java.math.*;

/*
    Pour un message donné, récupérer le code ASCII sur 7 bits. Puis d'effectuer l'encodage suivant : 
	0 0  -> 1 bit à 1
	00 0 -> 1 bit à 0
	0 0000 -> 4 bits successifs à 1
	
	
*/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String mBin = "";
			
			// ASCII to Binary		
          byte[] bytes = MESSAGE.getBytes();  
          StringBuilder binary = new StringBuilder();  
          for (byte b : bytes)  
          {  
             int val = b;  
             for (int i = 0; i < 8; i++)  
             {  
                binary.append((val & 128) == 0 ? 0 : 1);  
                val <<= 1;  
             }
             
             mBin += binary.toString().substring(1, binary.length());
             binary = new StringBuilder();

          }  
          
         //Binary of message binary.toString();  
         
         
  
         
         StringBuilder result = new StringBuilder();
         
         for (int i = 0; i< mBin.length(); i++)
         {
             int count=1; 
             
             
             for (int j = i+1; j <mBin.length(); j++)
             {
                if (mBin.charAt(i) == mBin.charAt(j))
                {
                    count++;   
                    
                }
                else break;
                 
             }
             
             if (mBin.charAt(i) == '1')
                result.append("0 ");
            
             else 
                result.append("00 ");
            
            i = i + count -1;    
            while (count != 0)
            {
                count--;
                result.append("0");
            }
            
            result.append(' ');
            
            
             
         }
         
         
         
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println (result.toString().substring(0, result.length()-1));
        
    }
}