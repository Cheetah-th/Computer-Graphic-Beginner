//61050190 Thanatorn Songsyom
import java.util.*;

public class CheckID_61050190 {
	static Random random = new Random();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 1000;
		int low = 10;
		int high = 99;
		int id = getStudentID();
		int a[] = new int[n];
		System.out.println();

		getRandomID(a, random, low, high);
		System.out.println("Random ID");
		printID(a);
		System.out.println();
		
		MS(a, 0, a.length - 1);
		System.out.println("After sort");
		printID(a);
		System.out.println();

		checkID(a, id);
		
	}

	public static int getStudentID() {
		System.out.print("Enter your id : ");
		String stdID = scan.next();
		stdID = stdID.substring(6);
		int id = Integer.parseInt(stdID);
		System.out.println("ID : " + id);
		return id;

	}

	public static void getRandomID(int a[], Random random, int low, int high) {
		for (int i = 0; i < a.length; i++) {
			int rd = random.nextInt((high - low) + 1) + low;
			a[i] = rd;
		}

	}

	public static void printID(int[] a) {
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("ID " + (i + 1) + " : " + a[i]);
//		}
		System.out.println(Arrays.toString(a));

	}
	
	public static void Merge(int[] a, int lo, int m, int hi) {
		int temp[] = new int[hi + 1];
		int l = lo, i = lo, j = m;
		while (l <= (m - 1) && j <= hi) {
			if (a[l] <= a[j]) {
				temp[i] = a[l];
				l++;
			} else {
				temp[i] = a[j];
//				count++;
				j++;
			}
			i++;
		}
		if (l > (m - 1)) {
			for (int k = j; k <= hi; k++) {
				temp[i] = a[k];
				i++;
			}
		} else {
			for (int k = l; k <= (m - 1); k++) {
				temp[i] = a[k];
				i++;
			}
		}
		for (i = lo; i <= hi; i++)
			a[i] = temp[i];

	}

	public static void MS(int[] a, int lo, int hi) {
		int m = 1;
		if (lo < hi) {
			if ((lo + hi) % 2 == 0) {
				m = (lo + hi) / 2;
			} else {
				m = ((lo + hi) / 2) + 1;
			}
			MS(a, lo, m - 1);
			MS(a, m, hi);
			Merge(a, lo, m, hi);
		}

	}

	public static void checkID(int[] a, int id) {
		int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == id) {
					count++;
				}
				if (a[i] > id) {
					break;
				}
			}
		if (count > 3) {
			System.out.println("have " + count + " number : A");
		} else {
			System.out.println("have " + count + " number : F");
		}

	}

}
