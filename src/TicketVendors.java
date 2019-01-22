import java.util.Arrays;
import java.util.Collections;

public class TicketVendors {
	
	public static int solve(int[] vendors, int n){
	
		int max = findMax(vendors);
		int len = vendors.length;
		int[] newArr = new int[max + 1];
		
		for(int i= 0; i < len; i++){
			int var = vendors[i];		
			for(int j = var; j > 0; j--){
				newArr[j] += 1;
			}
		}
		len = newArr.length;
		int count = n;
		int res = 0;
		for(int i = len - 1; i >= 0; i--){
			
			int temp = 0;
			if(newArr[i] != 0 && count > 0){
				if(count >= newArr[i]){
					temp = newArr[i];							     
				}else
					temp = count;	
				count = count - temp;
				res += temp * i;
			}
				
			
		}
		
		return res;
	}

	public static int findMax(int[] arr){
		int len = arr.length;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < len; i++){
			max = (max > arr[i]) ? max : arr[i];
		}
		return max;
	}



}