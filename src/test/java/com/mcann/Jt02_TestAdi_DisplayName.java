package com.mcann;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Tüm java sınıflarını test ettiğimiz farklı bir konu")
public class Jt02_TestAdi_DisplayName {
	
	@Test
	@DisplayName("Başarılı bir testin anatomisi")
	void doSuccessTest(){
		System.out.println("");
	}
	
	@Test
	void testIgnoreByUserName(){
	
	}
	
	@Nested
	class IcSinif{
		
		@Test
		void detayTest(){
		
		}
		
		@Test
		void cooookFarkliBirTest(){
		
		}
	}
}