package ar.edu.unlp.info.oo1.ejercicio9_cuenta_con_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentasTest {
	private CajaDeAhorro miCajaDeAhorro;
	private CuentaCorriente miCuentaCorriente;
	
	@BeforeEach
	public void setUp() {
		this.miCajaDeAhorro = new CajaDeAhorro();
		this.miCuentaCorriente = new CuentaCorriente();
		this.miCajaDeAhorro.setSaldo(1000d);
		this.miCuentaCorriente.setSaldo(1000d);
		this.miCuentaCorriente.setLimiteDeDescubierto(-250d);
	}
	
	@Test
	public void testDepositar() {
		this.miCajaDeAhorro.depositar(200d);
		this.miCuentaCorriente.depositar(200d);
		
		assertEquals(1196d, this.miCajaDeAhorro.getSaldo());
		assertEquals(1200d, this.miCuentaCorriente.getSaldo());
	}
	
	@Test
	public void testExtraer() {
		assertTrue(this.miCajaDeAhorro.extraer(200d));
		assertTrue(this.miCuentaCorriente.extraer(200d));
		assertEquals(796d, this.miCajaDeAhorro.getSaldo());
		assertEquals(800d, this.miCuentaCorriente.getSaldo());
		
		assertTrue(this.miCuentaCorriente.extraer(900d));
	}
	
	@Test
	public void testTransferirA() {
		CajaDeAhorro nuevaCA = new CajaDeAhorro();
		CuentaCorriente nuevaCC = new CuentaCorriente();
		assertTrue(this.miCajaDeAhorro.transferirACuenta(200d, nuevaCA));
		assertTrue(this.miCuentaCorriente.transferirACuenta(200d, nuevaCC));
		assertEquals(196d, nuevaCA.getSaldo());
		assertEquals(200d, nuevaCC.getSaldo());
	}
	
	@Test
	public void testTransferenciaEntreMisCuentas() {
		assertTrue(this.miCajaDeAhorro.transferirACuenta(200, this.miCuentaCorriente));
		assertEquals(1200, this.miCuentaCorriente.getSaldo());
	}
	
}
