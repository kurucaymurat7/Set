package _17_Set;

import java.util.*;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */

    public static void main(String[] args) {
        arrayleriOlustur();
    }

    private static void arrayleriOlustur() {

        Set<Integer> ortakElemanlarSet = new HashSet<>();
        Set<Integer> farkliElemanlarSet = new HashSet<>();
        Set<Integer> siraliList = new TreeSet<>();
        List<Integer> tersSiraliList = new ArrayList<>();
        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();

        arrList1 = arrListHazirla(5, 0, 10);
        arrList2 = arrListHazirla(5, 0, 10);

        System.out.println(arrList1);
        System.out.println(arrList2);

        ortakElemanlarSet = ortakElemanlariBul(arrList1, arrList2);
        System.out.println("Ortak elemanlar set: " + ortakElemanlarSet);

        farkliElemanlarSet = farkliElemanlariBul(arrList1, arrList2);
        System.out.println("Farklı elemanlar set: " + farkliElemanlarSet);

        siraliList = sirala(arrList1, arrList2);
        System.out.println("Sirali List : " + siraliList);

        Collections.reverse(arrList1);
        tersSiraliList = tersSirala (siraliList);
        System.out.println("Ters sirali list : " + tersSiraliList);
    }

    private static List<Integer> tersSirala(Set<Integer> siraliList) {
        List<Integer> tersSiraliList = new ArrayList<>();
        for (Integer each:siraliList) {
            tersSiraliList.add(each);
        }
        Collections.reverse(tersSiraliList);
        return tersSiraliList;
    }

    private static Set<Integer> sirala(ArrayList<Integer> arrList1, ArrayList<Integer> arrList2) {
        Set <Integer> siraliList = new TreeSet<>();
        siraliList.addAll(arrList1);
        siraliList.addAll(arrList2);
        return siraliList;
    }

    private static Set<Integer> farkliElemanlariBul(ArrayList<Integer> arrList1, ArrayList<Integer> arrList2) {
        Set<Integer> farkliElemanlarListe = new HashSet<>();
        for (Integer each1 : arrList1) {
            if (!(arrList2.contains(each1))) {
                farkliElemanlarListe.add(each1);
            }
        }
        for (Integer each2 : arrList2) {
            if (!(arrList1.contains(each2))) {
                farkliElemanlarListe.add(each2);
            }
        }
        return farkliElemanlarListe;
    }

    private static Set<Integer> ortakElemanlariBul(ArrayList<Integer> arrList1, ArrayList<Integer> arrList2) {
        Set<Integer> ortakElemanlarSet = new HashSet<>();
        for (Integer each : arrList1) {
            if (arrList2.contains(each)) {
                ortakElemanlarSet.add(each);
            }
        }
        return ortakElemanlarSet;
    }

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1));
    }

    private static ArrayList<Integer> arrListHazirla(int size, int min, int max) {
        ArrayList<Integer> bosList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            bosList.add(getRandom(min, max));
        }
        return bosList;
    }
}
