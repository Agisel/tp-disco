package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testearElPerimetroInterior() {
		
		Disco miDisco1 = new Disco(2.5,3.5);
		Double valorEsperado=15.70;
		Double valorObtenido= miDisco1.calculaPerimetroInterior();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

	@Test
	public void testearElPerimetroExterior() {
		
		Disco miDisco1 = new Disco(2.5,3.5);
		Double valorEsperado=21.99;
		Double valorObtenido= miDisco1.calculaPerimetroExterior();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void testearSuperficie() {
		
		Disco miDiscoTest = new Disco(2.5,3.5);
		Double valorEsperado=38.48;
		Double valorObtenido= miDiscoTest.calcularSuperficie();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	
	
	}
	
	
}
