package ins.aiite.testng;

import org.testng.annotations.Test;

public class ParallelClass2 {
	@Test
	public void test4()
	{
		System.out.println("Working THread is: "+Thread.currentThread().getId());
		System.out.println("Test4");
		
	}
	
	
	@Test
	public void test5()
	{
		System.out.println("Working THread is: "+Thread.currentThread().getId());
		System.out.println("Test5");
		
	}
	
	@Test
	public void test6()
	{
		System.out.println("Working THread is: "+Thread.currentThread().getId());
		System.out.println("Test6");
		
	}

}
