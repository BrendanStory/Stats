public class Stats {

	public static void main(String[] args) {
		int[] a = {  1,  2,  3,  4,  5, 6};


		max(a);
		min(a);
		mean(a);
		median(a);
		mode(a);
	}

	public static int max (int[] a) {

		int x = a[0];

		for (int i = 0; i < a.length ; i++) {

			if (x < a[i]) {
				x = a[i];
			} 
		}
		return x;
		
	}


	public static int min(int[] a) {

		int x = a[0];

		for (int i = 0; i < a.length; i ++) {
			
			if ( x > a[i] ) {
				x = a[i];
			}
		}

		return x;
	}

	public static double mean(int[] a) {

		double x = 0;

		for (int i = 0; i < a.length; i++ ) {
			
			x = a[i] + x;
		}

		x = x/a.length;

		return x;
	}

	public static double median(int[] a) {

		

		int x = a.length/2;
		return a[x];



		
	}

	public static double quartile1(int[] a) {

		int x = (int)median(a)/2;
		return x;

	}

	public static int quartile3(int[] a) {

		int x = (int)median(a) + (int)quartile1(a);
		return x;

	}

	public static int mode(int[] a) {

		int x = a[0];
		int y = 1;
		

		for (int i = 0;i < a.length; i++ ) {
			
			if (x == a[i]) {
					y++;
				}	

		}

		if (y > 1) {
			return x;
			
		}
		return x;
	}

	public static int standardDeviation(int[] a) {

	}
}