package ListasdeExercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int ano, mes, dia, totaldias;

		System.out.printf("Entre com o total de dias que você viveu ");
		totaldias = leia.nextInt();

		ano = totaldias / 365;
		mes = (totaldias % 365) / 30;
		dia = (totaldias % 365) % 30;

		System.out.printf("\nSua idade em anos é: " + ano);
		System.out.printf("\nSua idade em meses é: " + mes);
		System.out.printf("\nSua idade em dias é: " + dia);
	}

}
