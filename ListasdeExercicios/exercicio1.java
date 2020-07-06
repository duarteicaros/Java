package ListasdeExercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int ano, mes, dia;
		double totaldias;

		System.out.printf("Entre com o dia do seu nascimento: ");
		dia = leia.nextInt();

		System.out.printf("Entre com o mes do seu nascimento: ");
		mes = leia.nextInt();

		System.out.printf("Entre com o ano do seu nasciemento: ");
		ano = leia.nextInt();

		totaldias = ((ano) + (mes) + dia);

		System.out.println("\nSua idade em dias é: " + totaldias);
	}

}
