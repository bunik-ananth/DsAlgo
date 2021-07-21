package programs.arrays;

/*
 * Array which will give you the max diffrence(need to buy stock at min prize and sell at max price)
 * Which day you have to buy the stock and which day you have to sell the stock with max profit
 * 
 * [9,2,3,4,1,3,7,8]
 * so buy the stock at 1rs and sell the stock at 8rs so get the max
 * 
 * https://www.youtube.com/watch?v=eMSfBgbiEjk&ab_channel=takeUforward
 */




public class BuySellStock {
	//Dutch National Flag Algo(take max value as 0 and min values as huge number)
	public static void main(String[] args) {
		int[] array = {9999,2,4,3,6,1,7,8,90,999,806};
		buySell(array);
	}
	
	
	public static void buySell(int[] array) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit =0;
		for(int i=0; i<array.length; i++) {
			if(array[i] < minPrice)
				minPrice = array[i];
			
//			else if (array[i] - minPrice > maxProfit) {
//				maxProfit = array[i] - minPrice;
//			}
			else if(array[i] > maxProfit)
				maxProfit = array[i];
		}
		System.out.println(minPrice);
		System.out.println(maxProfit);
	}
}
