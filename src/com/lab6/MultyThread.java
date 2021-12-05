package com.lab6;

public class MultyThread {
    public static long workTime;

    float[] arr;
    float[] fArr = new float[Main.h];
    float[] sArr = new float[Main.h];
    long end;
    long start;

    public MultyThread(long start)
    {
        this.start = start;
        arr = Main.pulling(Main.size);
        System.arraycopy(arr, 0, fArr, 0, Main.h);
        System.arraycopy(arr, Main.h, sArr, 0, Main.h);

        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < fArr.length; i++)
                    fArr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

//                System.out.println("t1 ОТРАБОТАЛ! за: " + (start - System.currentTimeMillis()) * -1 + "мс");
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < sArr.length; i++)
                    sArr[i] = (float) (arr[i + Main.h - 1] * Math.sin(0.2f + (i + Main.h - 1) / 5) * Math.cos(0.2f + (i + Main.h - 1) / 5) * Math.cos(0.4f + (i + Main.h - 1) / 2));

//                System.out.println("t2 ОТРАБОТАЛ! за: " + (start - System.currentTimeMillis()) * -1 + "мс");
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(fArr, 0, arr, 0, Main.h);
        System.arraycopy(sArr, 0, arr, Main.h, Main.h);

        end = System.currentTimeMillis();
        workTime = end - start;


        System.out.println(arr[arr.length -1] );

        System.out.println("Мультипоток отработал за: " + workTime + "мс");

    }
}
