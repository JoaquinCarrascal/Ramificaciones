package calculadora_EEDD;

import java.util.Scanner;

public class ppal {

	public static void main(String[] args) {

		double var1, var2, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primer número:");
		var1 = Double.parseDouble(sc.nextLine());

		System.out.println("Segundo número:");
		var2 = Double.parseDouble(sc.nextLine());
		
		resultado = var1 + var2; 
		System.out.println(resultado);
		System.out.println("Pensado para ramificarse.");
		

		sc.close();
	}

}
