/*. Construa um programa em c que, tendo como dados de entrada dois pontos
 *  quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
 *   A fórmula que efetua tal cálculo é: d=raiz de (x2-x1)² + (y2-y1)² */

package ListasdeExercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);

		double d, xf, yf, x1, x2, y1, y2;

		System.out.printf("Informe o valor de X do ponto 1: ");
		x1 = leitura.nextInt();
		System.out.printf("Informe o valor de Y do ponto 1: ");
		y1 = leitura.nextInt();
		System.out.printf("Informe o valor de X do ponto 2: ");
		x2 = leitura.nextInt();
		System.out.printf("Informe o valor de Y do ponto 2: ");
		y2 = leitura.nextInt();

		xf = Math.pow((x2 - x1), 2);
		yf = Math.pow((y2 - y1), 2);

		d = Math.sqrt(xf + yf);

		System.out.println("O resultado de D é: " + d);

	}

}
