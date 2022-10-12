import java.util.Random;

/** Documentation for my first project in Java.*/

public class MainClass {
	
	/** Documentation for my first project in Java.*/
	public static int multiply(int a) {
		return a * 2;
	}
	/** Documentation for my first project in Java.*/
	public static void main(String[] args) {
			int n = 10;
			Random rand = new Random();
			int i = rand.nextInt(n);
			int i2 = i * 2;
			int i3 = multiply(i);
			System.out.println(i2);
			
	}

}
