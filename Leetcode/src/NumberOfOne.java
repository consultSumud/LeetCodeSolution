
public class NumberOfOne {

	public static void main(String[] args) {

		// you need to treat n as an unsigned value

	}

	public int hammingWeight(int n) {
		String biString = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < biString.length(); i++) {
			if (biString.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

}
