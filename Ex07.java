package _17_Set;

import java.lang.module.FindException;
import java.util.HashSet;

public class Ex07 {

	/*  TASK :
	 * main method altinda bir double hashSet olusturunuz.
	 * 
	 * ve bu seti, adi setOlustur ve return tipi hashSet double olan
	 * 
	 * ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
	 * kullanarak doldurun.
	 * 
	 * adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
	 * edecek ayri bir method olusturarak
	 * 
	 * hashSetin degerlerinin toplamini alacaksiniz.
	 */
	static HashSet <Double> hashSet = new HashSet<>();

	public static void main(String[] args) {

		hashSet = setOlustur (new double[]{3.23 , 3.10 , 5.12 , 10.12 , 23.12});
		System.out.println(hashSet);

		toplamiBul (hashSet);

	}

	private static void toplamiBul(HashSet<Double> hashSet) {
		double toplam = 0;
		for (double each:hashSet) {
			toplam +=  each;
		}
		System.out.println(toplam);
	}

	private static HashSet<Double> setOlustur(double[] doubles) {
		for (int i = 0; i < doubles.length; i++) {
			hashSet.add(doubles[i]);
		}
		return hashSet;
	}

}
