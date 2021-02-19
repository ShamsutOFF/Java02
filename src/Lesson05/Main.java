package Lesson05;

import java.util.Arrays;

public class Main {

    static final int SIZE = 10000000 ;
    static final int HALF = SIZE / 2 ;
    static float [] arr = new float [ SIZE ];
    static float [] arr2 = new float [ SIZE ];

//    long a = System.currentTimeMillis();

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
            arr2[i] = 1;
            }
        method01();
        method02();
    }

    public static void method01(){
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = ( float )( arr [ i ] * Math . sin ( 0.2f + i / 5 ) * Math . cos ( 0.2f + i / 5 ) *
                    Math . cos ( 0.4f + i / 2 ));
        }
        long b = System.currentTimeMillis();
  //      System.out.print (Arrays.toString (arr));
        System.out.println (b-a);
    }

    public static void method02(){
        long a = System.currentTimeMillis();
        float a1[] = new float[HALF],
                a2[] = new float[HALF];
        System.arraycopy(arr2, 0, a1, 0, HALF);
        System.arraycopy(arr2, HALF, a2, 0, HALF);
        MyThread t1 = new MyThread (a1,0);
        MyThread t2 = new MyThread (a2,HALF);
        t1.start ();
        t2.start ();
        System.arraycopy (a1,0,arr2,0,HALF);
        System.arraycopy (a2,0,arr2,HALF,HALF);
        long b = System.currentTimeMillis();
 //       System.out.print (Arrays.toString (arr2));
        System.out.println (b-a);
    }
}

class MyThread extends Thread {
    public MyThread(float[] a, int b) {
        for (int i = 0; i <a.length ; i++) {
            a[i] = ( float )( a [ i ] * Math . sin ( 0.2f + (i+b) / 5 ) * Math . cos ( 0.2f + (i+b) / 5 ) *
                    Math . cos ( 0.4f + (i+b) / 2 ));
        }
    }

    public void run(){

        }
    }


/*
Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
Отличие первого метода от второго:
● Первый просто бежит по массиву и вычисляет значения.
● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.
Пример деления одного массива на два:
● System.arraycopy(arr, 0, a1, 0, h);
● System.arraycopy(arr, h, a2, 0, h).
Пример обратной склейки:
● System.arraycopy(a1, 0, arr, 0, h);
● System.arraycopy(a2, 0, arr, h, h).
Примечание:
System.arraycopy() — копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек
копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:
Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и
склейки.

 */