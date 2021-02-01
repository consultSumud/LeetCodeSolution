
public class Rough {

	public static void main(String[] args) {
		 int sum = 0;
		 int n=15;
	        while (n != 0) {
	            System.out.println(n &= (n-1));
	            sum++;
	        }
	        System.out.println(sum);
	    }

	}

