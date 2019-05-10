package hello;
import java.util.Arrays;
import java.util.Scanner;
public class MarkAndToys {
	public int maximumToys(int prices[],int k){
		Arrays.sort(prices);
		int n= prices.length;
		int tot =0;
		int total = 0;
		for(int j =0;j<n;j++){
			tot+= prices[j];
			
			if(tot>k){
				break;
			}
			total++;
		}
		return total;
		
	}
	
	Scanner input = new Scanner(System.in);
	public  void main(String args[]){
		 
		String[] nk = input.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
	
		int [] prices= new int[n];
		
		String [] pricesItems= input.nextLine().split(" ");
		
		for(int i = 0; i<n;i++){
			int pricesItem= Integer.parseInt(pricesItems[i]);
			prices[i]= pricesItem;
			
			int result = maximumToys(prices, k);
			
			
		}
	}
}
