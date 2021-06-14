package Day_30_Invoice;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.Assert;

class InviceServiceTest {

	@Test
	public void givenDistanceAndTime_ReturnTotalFare() {

		InvoiceGenerate invoiceGenerator = new InvoiceGenerate();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

	@Test
	public void givenDistanceAndTime_ReturnMinimumFare() {
		InvoiceGenerate invoiceGenerator = new InvoiceGenerate();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

	@Test
	public void givenMultipleRides_ReturnInvoiceSummary() {
		InvoiceGenerate invoiceGenerator = new InvoiceGenerate();
		Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}

}
