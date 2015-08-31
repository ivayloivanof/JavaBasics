package homework;

public class CountOfBitsOne {
	public static int Count(int number) {
		String numberBits = Integer.toBinaryString(number);
		char[] bits = numberBits.toCharArray();
		
		int result = 0;
		
		for (int i = 0; i < bits.length; i++) {

			if (bits[i] == '1') {
				result++;
			}
		}
		
		return result;
	}
}
