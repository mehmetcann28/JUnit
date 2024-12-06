package com.mcann;

public class Islemler {
	
	public int toplam(int s1, int s2) {
		int toplam = s1 + s2;
		return toplam;
	}
	
	public double bolum(double s1, double s2) {
		if (s2 == 0) {
			System.out.println("İşlem tanımsız çıkar 0 dan farklı bir değer giriniz.");
			return 0;
		}
		double result = s1 / s2;
		return result;
	}
	
	public int carpim(int s1, int s2,String token) {
		if (token.equals("admin")){
			try {
				Thread.sleep(8);
			}
			catch (Exception ex) {}
			return s1 * s2;
		}else {
			throw new RuntimeException("Geçersiz token bilgisi");
		}
	}
}