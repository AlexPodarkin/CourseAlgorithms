package exceptionsProgramming.homeWork;

import java.io.FileNotFoundException;
import java.util.*;

public class homeWork2 
{
    public static int userInput(String msg) 
    {
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true) {
            System.out.print(msg);
            try 
            {
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) 
            {
                System.out.println( "Неверный ввод! Введите целое число!" );
            }
        }
        return inputStr;
    }

    public static float floatInput(String msg) 
    {
        Scanner sc = new Scanner(System.in);
        float inputNum;
        while (true) 
        {
            System.out.print(msg);
            try 
            {
                inputNum =  Float.parseFloat(sc.next());
                break;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Неверный ввод! Введите число!");
            }
        }
        return inputNum;
    }

    public static void ex2() 
    {
        try 
        {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } 
        catch (NullPointerException ex) 
        {
            System.out.println("Указатель не может указывать на null!");
        } 
        catch (IndexOutOfBoundsException ex) 
        {
            System.out.println("Массив выходит за пределы своего размера!");
        } 
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException 
    {
        System.out.println(a + b);
    }

    public static void nullException(String msg) 
    {
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true) 
        {
            System.out.print(msg);
            try 
            {
                inputStr = sc.nextLine();
                break;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println( "Неверный ввод!");
            }
        }
        if (inputStr.isEmpty())
        {
            System.out.print("Пустая строка! Введите символы:");
            nullException(" ");
        }
        System.out.println(inputStr);
    }

    public static void task2()
    {
        int d =0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try 
            {
                double catchedRes1 = 8 / d;
                System.out.println("catchedRes1 = " + catchedRes1);
                break;
            } catch (ArithmeticException e) 
            {
                System.out.println("На ноль делить нельзя, Catching exception: " + e);
                System.out.print("Введите число -> ");
                d = sc.nextInt();
            }
        }
         
    }

    public static void main(String[] args) 
    {
        System.out.println("""
                1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.              
                2. Дан следующий код, исправьте его там, где требуется.          
                3. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
                Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
                4. TaskTest """);

        int checkExit = 4;
        while (checkExit != 0) 
        {
            checkExit = userInput("\nВведите номер задачи ( Для выхода нажмите 0 ) -> ");
            switch (checkExit) 
            {
                case 1 -> 
                {
                    System.out.println(floatInput("\nВведите число: "));
                }
                case 2 -> ex2();
                case 3 -> nullException("\nВведите символы: ");
                case 4 -> task2();
            }
        }

    }
}
