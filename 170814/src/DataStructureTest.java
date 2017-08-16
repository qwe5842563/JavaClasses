import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ��@�ɶ��O���G
 * ����G<mm/dd>: <00:00>~<00:00>: <00:00>
 * �{���ؼСG
 * �]�p�W��G
 * �]�p�Q�k�G
 * �����X�G
 *  
 */

public class DataStructureTest {
	@Test
	public void testWiritInt() {
		DataStructure ds = new DataStructure(4);
		ds.write(0);
		ds.write(1);
		ds.write(2);
		ds.write(3);
		assertArrayEquals(new int[] { 1, 2, 3 }, ds.readOut());
	}

	public void testWiritArray() {
		DataStructure ds = new DataStructure(5);
		ds.writeArray(new int[] { 0, 1, 2, 3 });
		assertEquals(new int[] { 1, 2, 3 }, ds.readOut());
	}

	public void testReadOut() {
		DataStructure ds = new DataStructure(3);
		ds.writeArray(new int[] { 0, 1, 2, 3 });
		assertArrayEquals(new int[] { 1, 2, 3 }, ds.readOut());
	}
}
