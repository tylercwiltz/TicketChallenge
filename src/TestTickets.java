import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
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

	@Test(timeout = 3)
	public void testVendors() {
		int[] vendors = { 3, 4, 8, 6, 8, 9 };
		assertTrue(TicketVendors.solve(vendors, 5) == 40);
	}

	@Test(timeout = 3)
	public void testVendors2() {
		int[] vendors = { 3, 4, 8, 6, 8, 9, 9, 0, 3, 4, 5 };
		System.out.println(TicketVendors.solve(vendors, 10));
		assertTrue(TicketVendors.solve(vendors, 10) == 78);
	}

	@Test(timeout = 9)
	public void testVendors3() {
		int[] vendors = { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 520, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
		vendors = new int[] { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 520, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
		vendors = new int[] { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 520, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
		vendors = new int[] { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 520, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
		vendors = new int[] { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 520, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
		vendors = new int[] { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 520, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
		vendors = new int[] { 3, 4, 8, 6, 8, 9, 100, 0, 3, 4, 520, 1000, 300, 3000, 300, 40050, 60000, 6000 };
		assertTrue(TicketVendors.solve(vendors, 50000) == 1975775625);
	}

}
