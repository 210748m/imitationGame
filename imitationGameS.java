package imitationGame;

import java.util.Scanner;

public class imitationGameS
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please write your new password");
        String asa = s.nextLine();
        String pass = Ciphers.Ciphera(asa);
        System.out.println("Here is the encoded password: " + pass);
        System.out.println("Would you like to decipher the encrypted password?");
        String a = s.nextLine();
        if (a.contains("Y") || a.contains("y"))
        {
            System.out.println(Deciphers.Deciphera(pass));
        }   
        else 
        {
        	System.out.println("");
        }
        s.close();    
    }
}

        
