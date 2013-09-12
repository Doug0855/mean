import java.util.Random;

public class mean {

	private static Random r = new Random(5345);

	public static void main(String[] args) {
		 int[] randomArray = makeRandom(1000, 100);
		 System.out.println("The average of the array is ");
		 System.out.println(mean(randomArray) + ".");

		 System.out.println("The average from index 40 to index 45 is ");
		 System.out.println(meanofrange(randomArray, 40, 45) + ".");
	}

	public static double mean(int[] a) {
		int sum;
		for (int i=0; i<a.length; i++) {
			
		}

	}

	public double meanofrange(int[] a, int start, int end){

	}

	public static int[] makeRandom(int size, int range) {
		int[] a = new int[size];

		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(range + 1);
		}

		return a;

	}
}