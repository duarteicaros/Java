/*Um sistema de equações lineares do tipo: 
 * ax + by = c - pode ser resolvido como:
 * dx + ey = f
 * x = ce - bf/ae-bd
 * y=af-cd/ae-bd
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
 * e calcula e mostra os valores de x e y. 
 */

package ListasdeExercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int a, b, c, d, e, f;
		double x, y, c1, f1;

		System.out.printf("Informe o valor de A: ");
		a = leitura.nextInt();
		System.out.printf("Informe o valor de B: ");
		b = leitura.nextInt();
		System.out.printf("Informe o valor de C: ");
		c = leitura.nextInt();
		System.out.printf("Informe o valor de D: ");
		d = leitura.nextInt();
		System.out.printf("Informe o valor de E: ");
		e = leitura.nextInt();
		System.out.printf("Informe o valor de F: ");
		f = leitura.nextInt();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		c1 = (a * x) + (b * y);
		f1 = (d * x) + (e * y);

		System.out.println("O valor de C é igual a: " + c1);
		System.out.println("O valor de C é igual a: " + f1);

	}

}
