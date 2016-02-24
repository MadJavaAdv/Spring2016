//Neil Class
//Contains routines to get keyboard input
//by www.neiljohan.com

package java112.labs1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NeilClass
{
    public static String GetInputString(final String tMessage) throws IOException
    {
        final BufferedReader tKeyboard =  new BufferedReader(new InputStreamReader(System.in));
        System.out.print(tMessage);
        System.out.flush();
        String tLinex = tKeyboard.readLine();
        return tLinex;
    }

    public static int GetInputInt(final String tMessage) throws IOException
    {
        final BufferedReader tKeyboard =  new BufferedReader(new InputStreamReader(System.in));
        System.out.print(tMessage);
        System.out.flush();
        String tLinex = tKeyboard.readLine();
        int tValue=0;

        try
        {
            tValue = new Integer(tLinex).intValue();
        }
        catch (NumberFormatException pNumberFormatException)
        {
            System.out.println("You typed in a non-digit character or other non-valid input");
            System.exit(1);
        }
        return tValue;
    }


    public static double GetInputDouble(final String tMessage) throws IOException
    {
        final BufferedReader tKeyboard =  new BufferedReader(new InputStreamReader(System.in));
        System.out.print(tMessage);
        System.out.flush();
        String tLinex = tKeyboard.readLine();
        double tValue=0;

        try
        {
            tValue = new Double(tLinex).doubleValue();
        }
        catch (NumberFormatException pNumberFormatException)
        {
            System.out.println("You typed in a non-digit character or other non-valid input");
            System.exit(1);
        }
        return tValue;
    }

    public static void DrawLine(int tLength)
    {
        for (int Counter = 1; Counter <  tLength; Counter++)
        {
            System.out.print('-');
        }
        System.out.println();

    }
}