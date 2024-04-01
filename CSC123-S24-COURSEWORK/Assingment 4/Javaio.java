import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Javaio {
    public static void main(String[] args) {
        String input = "Integer: 111, Byte: -10, Long: 000000000, Short: 0000, Double: 00.0, Float: 0.000, Boolean: true, Delimiter:, 300000, Hello, World, : 000000: Hello:World:";
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter(", ");

        while (scanner.hasNext()) {
            String token = scanner.next();
            if (isInteger(token)) {
                System.out.println("Integer: " + Integer.parseInt(token));
            } else if (isByte(token)) {
                System.out.println("Byte: " + Byte.parseByte(token));
            } else if (isLong(token)) {
                System.out.println("Long: " + Long.parseLong(token));
            } else if (isShort(token)) {
                System.out.println("Short: " + Short.parseShort(token));
            } else if (isDouble(token)) {
                System.out.println("Double: " + Double.parseDouble(token));
            } else if (isFloat(token)) {
                System.out.println("Float: " + Float.parseFloat(token));
            } else if (isBoolean(token)) {
                System.out.println("Boolean: " + Boolean.parseBoolean(token));
            } else {
                System.out.println(token);
            }
        }
        System.out.println("Delimiter:");
        String additionalInput = "300000, Hello World,: 200000: Hello:World:";
        scanner = new Scanner(additionalInput);
        scanner.useDelimiter(", ");

        while (scanner.hasNext()) 
        {
            String token = scanner.next();
            if (isInteger(token)) 
            {
                System.out.println(Integer.parseInt(token));
            } 
            else 
            {
                System.out.println(token);
            }
        }
    }
    private static boolean isInteger(String s) 
    {
        try 
        {
            Integer.parseInt(s);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }

    private static boolean isByte(String s) 
    {
        try 
        {
            Byte.parseByte(s);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }

    private static boolean isLong(String s) 
    {
        try 
        {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) 
        {
            return false;
        }
    }

    private static boolean isShort(String s) 
    {
        try 
        {
            Short.parseShort(s);
            return true;
        } catch (NumberFormatException e) 
        {
            return false;
        }
    }

    private static boolean isDouble(String s) 
    {
        try 
        {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) 
        {
            return false;
        }
    }

    private static boolean isFloat(String s) 
    {
        try 
        {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException e) 
        {
            return false;
        }
    }

    private static boolean isBoolean(String s) 
    {
        return s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false");
    }
}

