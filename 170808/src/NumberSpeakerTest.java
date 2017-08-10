import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 實作時間記錄：
 * 日期：<08/08>: <00:00>~<00:00>: <02:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 虛擬碼：
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
		 * 完整：123456789 => 一億兩千三百四十五萬六千七百八十九
		 * 中間有0的講法
		 * 101 => 一百零一 //單獨一個或多個就講一個零
		 * 最後有零的說法
		 * 
		 */
		assertEquals("一百二十三", ns.transScriptOf(123));
		assertEquals("負一百二十三", ns.transScriptOf(-123));
		
		ns = null;
	}

}
