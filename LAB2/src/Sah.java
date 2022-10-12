import java.math.BigInteger;

public class Sah {

	BigInteger calculateBoabeGrau() {
		BigInteger result = new BigInteger("0");
		for (int i = 1; i <= 64; i++) {
			result = result.add(BigInteger.valueOf((long) Math.pow(2, i - 1)));
		}
		return result;
	}

}
