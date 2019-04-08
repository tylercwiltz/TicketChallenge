import java.util.Comparator;
import java.util.PriorityQueue;

public class TicketVendors {

	public static int solve(int[] vendors, int n) {
		PriorityQueue<Integer> vendorsPQ = new PriorityQueue<Integer>(1, new sortDescending());
		int total = 0;
		for(int i = 0; i < vendors.length; i++) {
			vendorsPQ.add(vendors[i]);
		}
		for(int i = 0; i < n; i++) {
			int usedTicket = vendorsPQ.poll();
			total += usedTicket;
			vendorsPQ.add(--usedTicket);
		}
		return total;
	}
}
class sortDescending implements Comparator<Integer>{ 
    public int compare(int num1, int num2) { 
        if (num1 < num2) {
            return 1; 
        }
        else if (num1 > num2) {
            return -1; 
        }
        	return 0; 
        }

	@Override
	public int compare(Integer o1, Integer o2) {
		 if (o1 < o2) {
	            return 1; 
	        }
	        else if (o1 > o2) {
	            return -1; 
	        }
		return 0;
	}
} 