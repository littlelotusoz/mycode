package TrainingPackage;

public class TestBox {

	public static void main(String[] args) {
		
		Box ups = new Box();
		Box fedEx = new Box(); // type new, then control space, new object. type Box tab fedex tab delete arguments.
		
		ups.length = 5;
		ups.width = 10;
		ups.calculateArea();
		
		fedEx.length = 6;
		fedEx.width= 7;
		fedEx.calculateArea();

	}

}
