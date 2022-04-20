package _17_Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
parametresi Integer set ve integer array ve adi elementEkle
olan array elemanalrı set'e convert edn bir method create ediniz .
yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
 */

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 4, 6, 5, 7, 8, 0, 2, 6};
        Set<Integer> set1 = new HashSet<>();
        elementEkle(array1, set1);
    }

    private static void elementEkle(int[] array1, Set<Integer> set1) {
        for (Integer each:array1) {
            set1.add(each);
        }
        setiyazdir(set1);
    }

    private static void setiyazdir(Set<Integer> set1) {
        System.out.println(set1);
    }

}
