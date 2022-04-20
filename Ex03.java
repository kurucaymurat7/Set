package _17_Set;

import java.util.*;

public class Ex03 {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */
    static List<Integer> arrayList = new ArrayList<>();
    static Set <Integer> tekrarsizSet = new TreeSet<>();

    public static void main(String[] args) {

        arrayOlustur(30, 0, 10);

        System.out.println(arrayList);

        tekrarEdenElemanlariSil(arrayList);

        setiArrayeDonustur(tekrarsizSet);

    }

    private static void setiArrayeDonustur(Set<Integer> tekrarsizSet) {
        int[] array = new int[tekrarsizSet.size()];
        int index = 0;
        for (Integer each:tekrarsizSet) {
            array[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void tekrarEdenElemanlariSil(List<Integer> arrayList) {
        tekrarsizSet.addAll(arrayList);
        System.out.println(tekrarsizSet);
    }

    private static void arrayOlustur(int size, int min, int max) {
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random()*(max-min+1)));
        }
    }
}

