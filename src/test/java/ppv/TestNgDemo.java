package ppv;

import org.testng.annotations.Test;

public class TestNgDemo {
	
	@Test(priority = 1, description="this is function 2 description")
	public void xyz() {
		System.out.println("This is fucnction 2 ");
	}
	
	@Test(priority = 2, description="this is function 1 description")
	public void abc() {
		System.out.println("This is fucnction 1 ");
	}

}
