package ru.netology.javaqadiplom;

public class Test {
    public class Main {


        public static void main(String[] args) {
            int n = 50;
            double[] array = new double[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random();
            }

            double max = array[0];
            double min = array[0];
            double avr = 0;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i])
                    max = array[i];
                if (min > array[i])
                    min = array[i];
                avr += array[i] / array.length;
            }
            System.out.println(max);
            System.out.println(min);
            System.out.println(avr);
        }
    }
}
