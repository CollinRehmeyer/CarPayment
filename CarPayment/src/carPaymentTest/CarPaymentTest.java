package carPaymentTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import carpayment.CarPayment;



public class CarPaymentTest 
{
	@Test
	void test()
	{
		CarPayment test1 = new CarPayment(35000, 0, 60, 10);
		System.out.println(test1.getPayment());
		System.out.println(test1.getTotalInterest());
		
		assertEquals(9618.79, test1.getTotalInterest(), 0.1);
		assertEquals(743.65, test1.getPayment(), 0.1);
		
	}
}
