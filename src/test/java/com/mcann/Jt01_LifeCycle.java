package com.mcann;

import org.junit.jupiter.api.*;

public class Jt01_LifeCycle {
	
	@BeforeAll
	static void initAll(){
		System.out.println("Tüm işlemler başlamadan önce ilk çalışan method");
	}
	
	@BeforeEach
	void iniBefore(){
		System.out.println("initBefore");
	}
	
	@Test
	void basariliTest(){
		System.out.println("1- Herşey yolunda dostum ☻");
	}
	
	@Test
	@Disabled("Bu test geçici olarak kapalıdır. 01.01.2026")
	void basariliTest2(){
		System.out.println("1.2- Herşey yolunda dostum ☺");
	}
	
	@Test
	void basarisizTest(){
		Assertions.fail();
		System.out.println("1- Bu sefer olmadı :(");
	}
	
	@AfterEach
	void afterTest(){
		System.out.println("afterTest Each");
	}
	
	@AfterAll
	static void afterTestAll(){
		System.out.println("afterTestAll En son method. Son ütücü.");
	}
}