package lab3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 400000;
        int [] arr = generateRandomArray(size);
        int [] arr2 = arr.clone();

        long  startTime = System.currentTimeMillis();
        ShellSort(size,arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Время сортировки Шелла " + (endTime - startTime));

        long  startTime2 = System.currentTimeMillis();
        Arrays.sort(arr2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время сортировки Array.sort() " + (endTime2 - startTime2));

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
}
