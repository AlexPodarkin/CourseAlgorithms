package lection;

//import java.util.Arrays;

public class lection_2 
{
    public static void main(String[] args) 
    {

        int[] array = new int[] { 5, 4, 7, 8, 9, 1, 12, 3, 0, -5, 15 };
        bubbleSort(array);

        System.out.print("Отсортированный массив ->  ");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n Бинарный поиск(индекса) числа -> ");
        System.err.println(binarySearch(array,55));
        // sort(array);
        // System.out.println(Arrays.toString(array));
    }

    public static int binarySearch(int[] array, int value)
    {
        return binarySearch(array, value, 0, array.length - 1); //разобрать array.length и 33стр
    }

    public static int binarySearch(int[] array, int value, int min, int max) 
    {
        int midpoint;

        if (max < min) //разобрать max <= min
        {
            return -1;
        } 
        else 
        {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value) 
        {
            return binarySearch(array, value, midpoint + 1, max);
        } 
        else if(array[midpoint] > value)
        {
            return binarySearch(array, value, min, midpoint - 1);
        }
        else
        {
            return midpoint;
        }        
    }

    public static void bubbleSort(int[] array) 
    {
        boolean finish;
        do 
        {
            finish = false;
            for (int i = 0; i < array.length - 1; i++) 
            {
                if (array[i] > array[i + 1]) 
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = true;
                }
            }
        } while (finish);
    }

    public static void sort(int[] array) 
    {
        for (int i = 0; i < array.length; i++) 
        { // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[j] < min) 
                {
                    pos = j; // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }

            array[pos] = array[i];
            array[i] = min; // меняем местами наименьший с array[i]
        }
    }

}
