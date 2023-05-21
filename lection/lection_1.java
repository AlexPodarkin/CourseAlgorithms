package lection;

import java.util.ArrayList;
import java.util.List;

public class lection_1
{

    public static void main(String[] args) 
    {
        // первый метод поиск делителя (сложность линейная O(n) ! )
        /* List<Integer> findAvailableDivider =  findAvailableDivider(12);

        for (Integer integer : findAvailableDivider) 
        {
            System.out.println(integer);
        } */

        // второй метод поиск простых чисел (сложность квадратичния O(n^2) ! )
        /* List<Integer> findAvailableDivider =  findSimpleNumbers(12);

        for (Integer integer : findAvailableDivider) 
        {
            System.out.println(integer);
        } */ 

        // рекурсия (поиск значения фибоначи)
        System.out.println(fib(8));
    }

    public static List<Integer> findAvailableDivider(int number)
    {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) 
         {
            if (number % i == 0) 
            {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max)
    {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) 
        {
            boolean simple = true;
            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0)
                {
                    simple = false;
                }
            }
            if (simple)
            {
                result.add(i);
            }
        }
        return result;
    }

    public static int fib(int position)
    {
        if (position ==1 || position ==2)
        {
            return 1;
        }
        return fib(position - 1) + fib(position - 2);
    }


}