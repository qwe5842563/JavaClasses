import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ��@�ɶ��O���G
 * ����G<08/08>: <00:00>~<00:00>: <02:00>
 * �{���ؼСG
 * �]�p�W��G
 * �]�p�Q�k�G
 * �����X�G
 *  
 */

public class NumberSpeakerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link NumberSpeaker#transScriptOf(int)}.
	 */
	@Test
	public void testTransScriptOf() {
		NumberSpeaker ns = new NumberSpeaker();
		/*
		 * ����G123456789 => �@����d�T�ʥ|�Q���U���d�C�ʤK�Q�E
		 * ������0�����k
		 * 101 => �@�ʹs�@ //��W�@�өΦh�ӴN���@�ӹs
		 * �̫ᦳ�s�����k
		 * 
		 */
		assertEquals("�@�ʤG�Q�T", ns.transScriptOf(123));
		assertEquals("�t�@�ʤG�Q�T", ns.transScriptOf(-123));
		
		ns = null;
	}

}
