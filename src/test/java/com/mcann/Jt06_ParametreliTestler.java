package com.mcann;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Jt06_ParametreliTestler {
	
	private final Islemler islemler = new Islemler();
	
	@ParameterizedTest
	@ValueSource(ints = {12,90,56,54,99,13,45,112,5,101})
	void testToplam(int sayi){
		Assertions.assertTrue(sayi < 100);
	}
	
	@ParameterizedTest
	@NullSource
	@EmptySource
	@ValueSource(strings = {""," ","dgdfg","\n"})
	void testString(String name){
		Assertions.assertTrue(name!=null && !name.isEmpty());
	}
}