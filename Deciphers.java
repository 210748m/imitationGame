package imitationGame;

public class Deciphers
{
    public static String Deciphera (String key)
    {
        String result = "";
        char a;
        int l = key.length();
        for(int i = 0; i < l; i++)
        {
           a = key.charAt(i);
           a -= 12;
           result += a;
        }
        final int mid = result.length() / 2; 
        String[] parts = {result.substring(0, mid), result.substring(mid)};
        String sec = parts[1] + parts[0];
        if(key.length() % 2 == 1){
        	char firstLetter = sec.charAt(0);
            sec = sec.substring(1);
            sec = sec + firstLetter;
            
            return sec;
        }
        else
        {
        	return sec;
        }
    }
}

