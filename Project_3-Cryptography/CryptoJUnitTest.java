/**
 * 
 * @author Renzo Svartz
 *
 */


package Project_3_Renzo_Svartz;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CryptoJUnitTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.stringInBounds("THIS TEST SHOULD BE INBOUNDS"));
		assertFalse(CryptoManager.stringInBounds("FAIL BECAUSE { IS OUTSIDE THE RANGE"));
		assertFalse(CryptoManager.stringInBounds("fail because of lowercase letters"));
		assertFalse(CryptoManager.stringInBounds("FAIL BECAUSE OF ESC CHAR "+((char) 27)));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("UFTUJOH",CryptoManager.encryptCaesar("TESTING", 1));
		assertEquals("]N\\]RWP)JWX]QN[)\\][RWP", CryptoManager.encryptCaesar("TESTING ANOTHER STRING", 9));
		assertEquals("fcjjm>umpjb", CryptoManager.encryptCaesar("HELLO WORLD", 30));
	}
	
	@Test
	public void testDecryptCaesar() {
		assertEquals("TESTING", CryptoManager.decryptCaesar("UFTUJOH", 1));
		assertEquals("TESTING ANOTHER STRING", CryptoManager.decryptCaesar("]N\\]RWP)JWX]QN[)\\][RWP", 9));
		assertEquals("HELLO WORLD", CryptoManager.decryptCaesar("fcjjm>umpjb", 30));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("WN#\\N &", CryptoManager.encryptBellaso("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.encryptBellaso("MERRY CHRISTMAS", "HELLO"));
		assertEquals("PR%UKP:K_\\VF=8V", CryptoManager.encryptBellaso("MERRY CHRISTMAS", "CMSC207")); 
		
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("TESTING", CryptoManager.decryptBellaso("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.decryptBellaso("UJ^^((HT^X[YYM\"", "HELLO"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.decryptBellaso("PR%UKP:K_\\VF=8V", "CMSC207")); 

	}

}
