package Lesson05;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class Test {
    static final int SIZE = 1000000;
    static final int H = SIZE / 2;
    static final BiConsumer<float[], Integer> fillArray = (array, offset) -> {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin (0.2f + (i + offset) / 5) * Math.cos (0.2f + (i + offset) / 5) * Math.cos (0.4f + (i + offset) / 5));
        }
    };

    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        firstMethod (arr);
        float[] arr2 = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr2[i] = 1;
        }
        secondMethod (arr2);
    }
    public static void firstMethod(float[] arr){
        long a = System.currentTimeMillis ();
        fillArray.accept (arr,0);
//        System.out.print (Arrays.toString (arr));
        System.out.println (System.currentTimeMillis ()-a );
    }

    public static void secondMethod(float[] arr){
        long a = System.currentTimeMillis();
        float a1[] = new float[H],
                a2[] = new float[H];
        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);
        Thread t1 = new Thread ( () -> fillArray.accept (a1,0) );
        Thread t2 = new Thread ( () -> fillArray.accept (a2, H) );
        t1.start ();
        t2.start ();
        try {
            t1.join ();
            t2.join ();
            System.arraycopy (a1,0,arr,0,H);
            System.arraycopy (a2,0,arr,H,H);
//            System.out.print (Arrays.toString (arr));
            System.out.println (System.currentTimeMillis ()-a );
        } catch (InterruptedException e){
            e.printStackTrace ();
        }
    }
}
