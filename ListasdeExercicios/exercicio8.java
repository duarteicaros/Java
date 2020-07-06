/*O custo ao consumidor de um carro novo é a soma do custo
 * de fábrica com a percentagem do distribuidor e dos impostos
 * (aplicados ao custo de fábrica). Supondo que a percentagem
 * do distribuidor seja de 28% e os impostos de 45%, escrever
 * um sistema que leia o custo de fábrica de um carro e escreva
 * o custo ao consumidor. */

package ListasdeExercicios;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String args[]) {

		Scanner leitura = new Scanner(System.in);

		double custo, custoF, pcdistribuidor, pcimposto;

		System.out.printf("Informe o valor do carro: ");
		custo = leitura.nextDouble();

		pcdistribuidor = (custo * 28) / 100;
		pcimposto = (custo * 45) / 100;

		custoF = custo + pcdistribuidor + pcimposto;

		System.out.println("\nO custo final é de: " + custoF);
	}

}
