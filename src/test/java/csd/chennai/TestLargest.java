package csd.chennai;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testPositiveValue() throws Exception
	{
		int []arr ={4,5,6,7,8,2};
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
	}
	public void testPositiveValueCrossCheck() throws Exception
	{
		int []arr ={4,5,9,7,9,2};
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
	}
	public void testNegativeValue() throws Exception
	{
		int []arr ={-4,-5,-6,-7,-9,-2};
		Largest obj = new Largest();
		assertEquals(-2, obj.find(arr));
	}
	public void testEmptyValue()
	{
		int []arr ={};
		Largest obj = new Largest();
		try{
		assertEquals(-2, obj.find(arr));
		fail();
		}catch(Exception ex)
		{
			assertTrue(true);
		}
	}

}
