//61050190 Thanatorn Songsyom
import java.util.*;

class itemType {
	public String itemCode;
	public double itemSize;
}

class Box_61050190 {
	static Random random = new Random();

	public static void main(String[] args) {
		int n = 20; //Number of item
		int low = 0; //Minimum random value of item size
		int high = 1; //Maximum random value of item size
		int decpl = 4; //Decimal place of item size
		
		itemType a[] = new itemType[n + 1];
		double box[] = new double[n + 1];
		
		getRandomItemSize(a, random, low, high, decpl);
		
		System.out.println();
		putItemInBox(a, box);

	}

	public static void getRandomItemSize(itemType[] a, Random random, int low, int high, int decpl) {
		for (int i = 1; i < a.length; i++) {
			double rd = random.nextDouble() * (high - low) + low;
			String decplCut = String.format("%." + decpl + "f", rd);
			a[i] = new itemType();
			a[i].itemCode = Integer.toString(i);
			a[i].itemSize = Double.parseDouble(decplCut);
		}
		printItem(a);

	}

	public static void printItem(itemType[] a) {
		for (int i = 1; i < a.length; i++) {
			System.out.println("Item " + a[i].itemCode + " : " + a[i].itemSize);
		}

	}

	public static void putItemInBox(itemType[] a, double[] box) {
		int totalbox = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if(box[j] + a[i].itemSize <= 1) {
					box[j] = box[j] + a[i].itemSize;
					System.out.println("Item " + a[i].itemCode + " Size " + a[i].itemSize + " : Put in box => " + j);
					if(j > totalbox) {
					totalbox = j;
					}
					break;
				}
			}
		}
		System.out.println("Use all " + totalbox + " box");

	}

}
