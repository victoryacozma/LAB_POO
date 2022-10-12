import java.math.BigInteger;

public class PrimitiveTypes {

	void checkMaxInt() {
		int firstNumber = Integer.MAX_VALUE;
		BigInteger secondNumber = new BigInteger("2147483647");
		;
		System.out.println("before addition: " + firstNumber);
		System.out.println("before addition: " + secondNumber);
		int result1 = firstNumber + 10;
		BigInteger result2 = secondNumber.add(new BigInteger("10"));
		System.out.println("result: " + result1);
		System.out.println("result: " + result2);

		float maxFloat1 = Float.MAX_VALUE;
		Float maxFloat2 = Float.MAX_VALUE;
		System.out.println("multiplying max float value: " + maxFloat1 * 2);
		System.out.println("multiplying max float value (Float wrapper class): " + maxFloat2 * 2);
	}

}
