package _17_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex06 {

    static Set<Integer> randomSet = new HashSet<>();

    public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.

        setOlustur(10, 0, 20);

    }

    private static void setOlustur(int size, int min, int max) {
        for (int i = 0; i < size; i++) {
            int each = 0;
            while (each == 0) {
                each = (int) (Math.random() * (max - min + 1));
            }
            randomSet.add(each);
        }
        System.out.println("Set : " + randomSet);
        setiArrayeDonustur (randomSet);
    }

    private static void setiArrayeDonustur(Set<Integer> randomSet) {
        int[] array = new int[randomSet.size()];
        int index = 0;
        for (Integer each:randomSet) {
            array[index] = each;
            index++;
        }
        System.out.println("Array : " + Arrays.toString(array));
    }
}

