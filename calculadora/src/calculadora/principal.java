package calculadora;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num1, num2, suma, resta, multiplicacion;
		double division;
		System.out.println("Introduzca un numero:");
		num1=sc.nextInt();
		System.out.println("Introduzca otro numero:");
		num2=sc.nextInt();
		Calculadora cal = new Calculadora(num1,num2);
		suma=cal.Suma();
		resta=cal.Resta();
		multiplicacion=cal.Multiplicacion();
		division=cal.Division();
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
	}

}
