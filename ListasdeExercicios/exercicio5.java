/*Faça um sistema que leia as 3 notas de um aluno e calcule
a média final deste aluno. Considerar que a média é ponderada
e que o peso das notas é: 2,3 e 5, respectivamente. */

package ListasdeExercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int n1, n2, n3;
		double mediaF, nota1, nota2, nota3;

		System.out.printf("Digite a primeira nota do aluno: ");
		n1 = leitura.nextInt();
		System.out.printf("Digite a segunda nota do aluno: ");
		n2 = leitura.nextInt();
		System.out.printf("Digite a terceira nota do aluno: ");
		n3 = leitura.nextInt();

		nota1 = n1 * 2;
		nota2 = n2 * 3;
		nota3 = n3 * 5;

		mediaF = (nota1 + nota2 + nota3) / 10;

		System.out.println("\nA média do aluno é: " + mediaF);

	}

}
