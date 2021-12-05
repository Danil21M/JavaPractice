package com.lab6;

public class SingleThread {
    public static long workTime;

    public void run()
    {
        long end;
        long start = System.currentTimeMillis();
        float[] arr = Main.pulling(Main.size);

        for(int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        end = System.currentTimeMillis();

        System.out.println(arr[arr.length -1] );

        workTime = end - start;
        System.out.println("Один поток отработал за: " + workTime + " мс");
    }
}
