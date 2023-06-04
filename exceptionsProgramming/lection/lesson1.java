package exceptionsProgramming.lection;

import java.io.File;

public class lesson1 
{
    public static void main(String[] args) 
    {
        System.out.println("lesson1");

        System.out.println(getFileSize(new File("123")));

        System.out.println(divide(-4,0));

        int[] ints = new int[10];
        System.out.println(ints[105]);

    }

    public static long getFileSize(File file)
    {
        if(!file.exists())
        {
            System.out.println("not file !");
            return -1L;
            // обработка, возвращаем -1 если файл не найден.
        }
        return file.length();
    }

    public static int divide(int a, int b)
    {
        if (b == 0)
        {
            throw new RuntimeException("Divade by zero not permited !!");
            // обработка исключений
        }
        return a / b;
    }

}
