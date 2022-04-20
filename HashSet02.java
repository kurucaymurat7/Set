package _17_Set;



import java.util.*;

public class HashSet02 {
    public static void main(String[] args) {
/*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}

    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */
    String[] isimlerArray = {"reha", "hakan", "haluk", "ipek", "ahsen"};

        Set <String> hs = new HashSet<>();
        for (int i = 0; i < isimlerArray.length; i++) {
            hs.add(isimlerArray[i]);
        }
        System.out.println("Hash Set : " + hs);

        Set <String> ts = new TreeSet<>();
        for (int i = 0; i < isimlerArray.length; i++) {
            ts.add(isimlerArray[i]);
        }
        System.out.println("Tree Set : " + ts);

        Set <String> lhs = new LinkedHashSet<>();
        for (int i = 0; i < isimlerArray.length; i++) {
            lhs.add(isimlerArray[i]);
        }
        System.out.println("Linked Has Set : " + lhs);

    }
}
