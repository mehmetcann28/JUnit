package com.mcann;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Jt03_AssertionsUsing {
	
	private static Islemler islemler;
	
	@BeforeAll
	static void initAll() {
		islemler = new Islemler();
	}
	
	@Test
	void standartAsseritonsUsing() {
		assertEquals(10, islemler.toplam(7, 3), "Doğru bir işlem");
	}
	
	@Test
	void standartAsseritonsUsingFail() {
		assertEquals(10, islemler.toplam(7, 5), "İki sayının toplamını verir eğer doğru değil ise beni arayın");
	}
	
	@Test
	void standartAsseritonsUsingBoolean() {
		assertTrue(islemler.toplam(7, 3) == 10);
	}
	
	@Test
	void groupAssertions(){
		assertAll("Tüm methodlar çalıştı mı?",
		          ()-> assertEquals(12,islemler.toplam(9,3)),
		          ()-> assertTrue(islemler.bolum(20,5)==4),
		          ()-> assertFalse(0!=0));
	}
	
	@Test
	void testCarpimSuccess(){
		assertEquals(50,islemler.carpim(5,10,"admin"));
	}
	
	@Test
	void exceptionAssertions(){
		RuntimeException rt =
				assertThrows(RuntimeException.class, () -> islemler.carpim(3, 5, "admin"), "");
		assertEquals("Geçersiz token bilgisi", rt.getMessage());
	}
	
	@Test
	void timeoutTest(){
		assertTimeout(Duration.ofMillis(10),()->islemler.carpim(12,3,"admin"));
	}
}