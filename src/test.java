import static org.junit.Assert.*;

public class test extends junit.framework.TestCase {

	Principale prin = new Principale();
	
	public static void testDePhrase() {
		Phrase maPhrase1 = new Phrase("jhzo[ek()]ro");
		Phrase maPhrase2 = new Phrase("jhzo[ek([jr] eo})ro");
		Phrase maPhrase3 = new Phrase("jhzoek(@eio[]zsih)rhsd}ro");
		assertEquals("La phrase est elle correcte ?",-1,Principale.verification(maPhrase1.getPhrase()));
		assertEquals("La phrase est elle correcte ?",-1,Principale.verification(maPhrase2.getPhrase()));
		assertEquals("La phrase est elle correcte ?",-1,Principale.verification(maPhrase3.getPhrase()));

	}
	

}
