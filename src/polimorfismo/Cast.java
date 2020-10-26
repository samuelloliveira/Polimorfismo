package polimorfismo;

public class Cast {
	
	public int multiplicar(int num1, float num2) {

		return (int) num1 * (int) num2;
	}
	
	public int multiplicar(float num1, double num2) {

		return (int) num1 * (int) num2;
	}
	
	public int multiplicar(int num1, Double num2) {

		return (int) num1 * num2.intValue();
	}

}