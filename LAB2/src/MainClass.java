public class MainClass {

	public static void main(String[] args) {
		Taxi taxi1 = new Taxi();
		Taxi taxi2 = new Taxi();

		System.out.println(taxi1.kmParcursi);

		taxi1.drive(10);
		taxi1.drive(20);

		taxi2.drive(15);

		System.out.println(taxi1.kmParcursi);
		System.out.println(taxi2.kmParcursi);

//		InputClass myClass = new InputClass();
//		myClass.checkInput(args);

//		PrimitiveTypes ex1 = new PrimitiveTypes();
//		ex1.checkMaxInt();

//		Sah ex1 = new Sah();
//		System.out.println(ex1.calculateBoabeGrau());

		double ex = 3.123456789112345678;

		float ex1 = -3.12f;
		float ex2 = 3.12f;

		float result1 = ex1 / 0;
		float result2 = ex2 / 0;

		float diff = result2 * result1;

		boolean myBoolVar = false;
		int myIntValue = 3;

		System.out.println(diff);
	}

}
