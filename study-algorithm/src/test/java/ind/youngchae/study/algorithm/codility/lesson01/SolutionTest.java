package ind.youngchae.study.algorithm.codility.lesson01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

	@Test
	public void test() {
		assertEquals(2, Solution.solution(9));
		assertEquals(4, Solution.solution(529));
		assertEquals(1, Solution.solution(20));
		assertEquals(0, Solution.solution(15));
	}
	
}

