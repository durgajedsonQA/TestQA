package ins.aiite.testng;

import org.testng.annotations.Test;

public class ParallelExample {

	@Test
	public void test1()
	{
		System.out.println("Working THread is: "+Thread.currentThread().getId());
		System.out.println("Test1");
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("Working THread is: "+Thread.currentThread().getId());
		System.out.println("Test2");
		
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("Working THread is: "+Thread.currentThread().getId());
		System.out.println("Test3");
		
	}
	
	
	
	
	
	
	
}


