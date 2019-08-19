package ind.youngchae.study.logging.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestTest {

	@Test
	public void test() {
		JunitTest jt = new JunitTest();
//		assertEquals(25,jt.square(5));
		assertEquals(27,jt.square(5));
	}

}
