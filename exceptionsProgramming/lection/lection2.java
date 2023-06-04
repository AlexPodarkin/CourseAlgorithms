package exceptionsProgramming.lection;

import java.io.FileReader;
import java.io.IOException;

public class lection2 
{
    public static void main(String[] args) 
    {
        int number = 1;
        try 
        {
            number = 10 / number;
            System.out.println(" ответ: " + number);
            String test = null;
            System.out.println(test.length());
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("невозможно выполнить данную операцию, ошибка: " + e);
        }
        catch (NullPointerException e) 
        {
            System.out.println("NullPointerException, ошибка: " + e);
        }
        catch (Exception e)
        {
            System.out.println(" Обшая ошибка, Exception:  " + e);
        }

        System.out.println("\n программа продолжает работать \n");


        FileReader test2 = null;
        try 
        {
            test2 = new FileReader("null");
            test2.read();
        } 
        catch 
        (NullPointerException | IOException e) 
        // можно перечислять исключения через "|"
        {
            System.out.println(" Исключение, FileNotFoundException " + e );
        } 
        finally
        {
            System.out.println("\n блок finally выполнится в любом случае. ");
            if (test2 != null) 
            {
                try 
                {
                    test2.close();
                } 
                catch (IOException e) 
                {
                    System.out.println("Exception, файл ");
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\n программа продолжает работать ");
    }
}
