package lab3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 40000;
        int [] arr = generateRandomArray(size);
        int [] arr2 = arr.clone();
        int [] arr3 = arr.clone();
        int [] arr4 = arr.clone();
        int [] arr5 = arr.clone();


        long  startTime = System.currentTimeMillis();
        ShellSort(size,arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Время сортировки Шелла: " + (endTime - startTime));

        long  startTime2 = System.currentTimeMillis();
        Arrays.sort(arr2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время сортировки Array.sort(): " + (endTime2 - startTime2));

        long  startTime3 = System.currentTimeMillis();
        shakerSort(arr3);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время сортировки перемешиванием " + (endTime3 - startTime3));

        long  startTime4 = System.currentTimeMillis();
        gnomeSort(arr4);
        long endTime4 = System.currentTimeMillis();
        System.out.println("Время сортировки гномья " + (endTime4 - startTime4));

        long  startTime5 = System.currentTimeMillis();
        bubbleSort(arr5);
        long endTime5 = System.currentTimeMillis();
        System.out.println("Время сортировки пузьрком " + (endTime5 - startTime5));
    }
    public static int[] generateRandomArray(int size){
        int [] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }
    public static void ShellSort(int n, int[] arr){
        int i, j, step;
        int tmp;
        for (step = n / 2; step > 0; step /= 2)
            for (i = step; i < n; i++)
            {
                tmp = arr[i];
                for (j = i; j >= step; j -= step)
                {
                    if (tmp < arr[j - step])
                        arr[j] = arr[j - step];
                    else
                        break;
                }
                arr[j] = tmp;
            }
    }
    public static void bubbleSort(int [] mas){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
    }
    public static void shakerSort(int [] arr) {
        int buff;
        int left = 0;
        int right = arr.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);
    }
    public static void gnomeSort(int[] array) {
        int index = 0;

        while (index < array.length) {
            if (index == 0 || array[index] >= array[index - 1]) {
                index++;
            } else {
                // Если текущий элемент меньше предыдущего, меняем их местами
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;

                // Возвращаемся на один шаг назад
                index--;
            }
        }
    }
}
