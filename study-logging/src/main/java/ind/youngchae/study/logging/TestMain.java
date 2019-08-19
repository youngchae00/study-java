package ind.youngchae.study.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {

	private static Logger logger = LoggerFactory.getLogger(TestMain.class);
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		while(true) {
			logger.debug("hello");
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
