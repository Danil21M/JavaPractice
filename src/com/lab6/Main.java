package com.lab6;

public class Main {

        public static final int size = 10000000;
        public static final int h = size / 2;

        public static void main(String[] args)
        {
            new SingleThread().run();
            new MultyThread(System.currentTimeMillis());

            increase(SingleThread.workTime, MultyThread.workTime);
        }

    public static void increase(long singleTime, long multiTime) {
        double diff = ((double) singleTime / (double) multiTime) - 1;
        int increase = (int) (diff * 100);

        System.out.printf("Увеличено: %d%%%n", increase);
    }

    public static float[] pulling(int size)
    {
        float[] arr = new float[size];
        for(int i = 0; i < size; i++)
            arr[i] = 1;
        return arr;
    }
}
