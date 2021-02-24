package Lesson05;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class Main2 {

    static final int SIZE = 10000000;
    static float [] arr = new float [ SIZE ];
    static float [] arr2 = new float [ SIZE ];
    static final BiConsumer<Integer, Integer> fillArray = (a, b) -> {
        for (int i = a; i < arr2.length ; i+=b) {
            arr2[i] = ( float )( arr2 [ i ] * Math . sin ( 0.2f + i / 5 ) * Math . cos ( 0.2f + i / 5 ) *
                    Math . cos ( 0.4f + i / 2 ));
        }
    };
//    public MyRunnableClass(int a, int b) {
//
//        for (int i = a; i < Main2.arr2.length ; i+=b) {
//            Main2.arr2[i] = ( float )( Main2.arr2 [ i ] * Math . sin ( 0.2f + i / 5 ) * Math . cos ( 0.2f + i / 5 ) *
//                    Math . cos ( 0.4f + i / 2 ));
//        }
//    }

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
        for (int i = 0; i < arr.length; i++) {
                        arr[i] = ( float )( arr [ i ] * Math . sin ( 0.2f + i / 5 ) * Math . cos ( 0.2f + i / 5 ) *
                    Math . cos ( 0.4f + i / 2 ));
        }
        long b = System.currentTimeMillis();
        System.out.println ("Без потоков: " + (b - a) + "мс");
   //     System.out.print (Arrays.toString (arr));
    }

    public static void method02() {

        long a = System.currentTimeMillis ( );
        int threads = 7;
        Thread t1 = null;
        for (int i = 0; i < threads; i++) {
            int finalI = i;
            t1 = new Thread (() -> fillArray.accept (finalI, threads));
            t1.start ();
        }
        try {
            t1.join ( );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
 //       System.out.print (Arrays.toString (arr2));
        long b = System.currentTimeMillis ( );
        System.out.println ("С потоками: " + (b - a) + "мс");
        System.out.println ("Массивы одинаковы : " + Arrays.equals(arr, arr2));
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