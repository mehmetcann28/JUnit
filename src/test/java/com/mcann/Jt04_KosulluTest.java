package com.mcann;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class Jt04_KosulluTest {
	/**
	 *
	 * path ->
	 * windows => c:\\klasor\\inner\\workspace\\konu.java
	 * MAC => userName/inner/workspace/konu.txt
	 */
	@Test
	@EnabledOnOs(OS.MAC)
	void onlyMacOS(){
		System.out.println("Mac OS X");
	}
	
	@Test
	@EnabledOnOs({OS.WINDOWS,OS.LINUX})
	void testLinuxAndWindows(){
		System.out.println("Linux and Windows");
	}
	
	@Test
	//@EnabledOnJre(JRE.JAVA_21)
	@EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_21)
	void textonJRE(){
		int deger = 5;
		String deger1 = switch (deger){
			case 1,3,7 -> "gfgfd";
			default -> "";
		};
		System.out.println("JRE 21");
	}
}