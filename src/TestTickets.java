import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * 
 * Several ticket vendors are selling their tickets at the fair. 
 * The price of a ticket is determined by the number of tickets the vendor has.
 * If the vendor has 9 tickets, the next ticket bought from that vendor will be 9 dollars.
 * After the purchase, the vendor will have 8 tickets and so will sell the next ticket for 8 dollars and so on. 
 * 
 * Given an array representing the number of tickets at each vendor, you must buy n tickets from the vendors. 
 * Your goal is to spend as much money as possible. 
 * Write an algorithm that will do just that and return the amount of money that you have spent.
 * 
 */
public class TestTickets {

	@Test
	public void testVendors() {
		int[] vendors = { 3, 4, 8, 6, 8, 9 };
		assertTrue(TicketVendors.solve(vendors, 5) == 40);
	}

	@Test
	public void testVendors2() {
		int[] vendors = { 3, 4, 8, 6, 8, 9, 9, 0, 3, 4, 5 };
		System.out.println(TicketVendors.solve(vendors, 10));
		assertTrue(TicketVendors.solve(vendors, 10) == 78);
	}

	@Test(timeout = 45)
	public void testOptimizedVendors() {
		long time = System.currentTimeMillis();
		int[] vendors = { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 1000007, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertEquals("Input does not match", TicketVendors.solve(vendors, 100007), 517769516);
		System.out.println((System.currentTimeMillis()-time));
	}

}
