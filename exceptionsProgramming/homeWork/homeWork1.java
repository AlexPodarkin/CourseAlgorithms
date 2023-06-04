package exceptionsProgramming.homeWork;

import java.io.File;

public class homeWork1 
{
    
    public static void main(String[] args) 
    {
        System.out.println("lesson1");

        System.out.println(getFileSize(new File("123")));

        System.out.println(divideI(5, 0));


        int[] ints = new int[10];
        int[] ints2 = new int[5];

        divArrays(ints, ints2);

        subtractionArrays(ints, ints2);
        // throws RuntimeException

        System.out.println(ints[105]);
        //IndexOutOfBoundsException

        System.out.println(divide(-4,0));
        // RuntimeException("Divade by zero not permited !!")
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

    public static int divideI(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("на ноль делить нельзя !!");
            return -1;
            // обработка исключений
        }
        return a / b;
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] subtractionArrays(int[] arr, int[] arr2) throws RuntimeException 
    {
        if (arr.length != arr2.length) 
        {
            throw new RuntimeException("lлины массивов не равны");
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            result[i] = arr[i] - arr2[i];
        }
        return result;
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException 
    public static int[] divArrays(int[] arr, int[] arr2) throws RuntimeException 
    {
        if (arr.length != arr2.length) 
        {
            throw new RuntimeException("длины массивов не равны");
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr2[i] == 0) {
                throw new RuntimeException("деление на ноль");
            }
            result[i] = arr[i] / arr2[i];
        }
        return result;
    }

}
