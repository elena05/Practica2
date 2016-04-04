package calculadora;

public class Calculadora {

	private int n1;
	private int n2;
	
	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	public int Suma() {
		
		return this.n1 + this.n2; 
	}
	
	public int Resta() {
		return this.n1 - this.n2;
	}
	
	public int Multiplicacion() {
		return this.n1 * this.n2;
	}
	
	public double Division() {
		return (double)this.n1 / this.n2;
	}
	
}
