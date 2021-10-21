package testss;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class tes {
    @Test()
    @DisplayName("Максимум, минимум и среднее в промежутке от 0 до 1")
    public void tesr() {

        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0]; // Массив не должен быть пустым
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }

    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avrg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avrg += array[i]/array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avrg = " + avrg);
    }

    @Test()
    @DisplayName("Максимум, минимум и среднее от 0 до 100")
    public void vesr() {
        Random random = new Random();
        int[] array = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        int max = array[0]; // Массив не должен быть пустым
        int min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += (double) array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
