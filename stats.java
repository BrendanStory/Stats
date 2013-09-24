public class stats {

	public static void main(String[] args) {
		int[] a = {  1,  2,  3,  4,  5, 6}; 

		//max(a);
		//min(a);
		//avg(a);
		med(a);
	}

	public static void max (int[] a) {

		int x = 0;

		for (int i = 0; i < a.length ; i++) {

			if (x < a[i]) {
				x = a[i];
			} 
		}

		System.out.println("The max is : " + x);
	}


	public static void min(int[] a) {

		int x = a[0];

		for (int i = 0; i < a.length; i ++) {
			
			if ( x > a[i] ) {
				x = a[i];
			}
		}

		System.out.println("The min is : " + x);
	}

	public static void avg(int[] a) {

		int x = 0;

		for (int i = 0; i < a.length; i++ ) {
			
			x = a[i] + x;
		}

		x = x/a.length;

		System.out.println("The average is : " + x);
	}

	public static void med(int[] a) {

		int x = 0;

		x = a.length/2;
		x = a[x];

		System.out.println("The median is : " + x);


		
	}

}