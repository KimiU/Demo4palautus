import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LaskukoneTest {

	@Test
	void Laskukone() {
		Laskukone laskukone = new Laskukone();
		assertEquals(Laskukone.annaTulos(), 0);
	}
	
	@Test
	void nollaa() {
		Laskukone laskukone = new Laskukone();
		laskukone.nollaa();
		assertEquals(Laskukone.annaTulos(), 0);
	}
	@Test
	void lisaaLuku() {
		Laskukone laskukone = new Laskukone();
		laskukone.lisaaLuku(7);
		assertEquals(Laskukone.annaTulos(), 7);
	}
	@Test
	void vahennaLuku() {
		Laskukone laskukone = new Laskukone();
		laskukone.vahennaLuku(7);
		assertEquals(Laskukone.annaTulos(), -7);
	}
	@Test
	void kerroLuvulla() {
		Laskukone laskukone = new Laskukone();
		laskukone.lisaaLuku(5);
		laskukone.kerroLuvulla(7);
		assertEquals(Laskukone.annaTulos(), 35);
	}
	@Test
	void korotaPotenssiin() {
		Laskukone laskukone = new Laskukone();
		laskukone.lisaaLuku(5);
		laskukone.korotaPotenssiin(3);
		assertEquals(Laskukone.annaTulos(), 125);
	}
	@Test
	void annaTulos() {
		Laskukone laskukone = new Laskukone();
		assertEquals(Laskukone.annaTulos(), 0);
	}

}
