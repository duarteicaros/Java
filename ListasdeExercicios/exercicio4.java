package ListasdeExercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		double d, r, s;
		int a, b, c;

		System.out.printf("Digite um valor pra A: ");
		a = leitura.nextInt();

		System.out.printf("Digite um valor pra B: ");
		b = leitura.nextInt();

		System.out.printf("Digite um valor pra C: ");
		c = leitura.nextInt();

		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);

		d = (r + s) / 2;

		System.out.println("\nResultado de D:" + d);

	}

}
