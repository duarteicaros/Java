package ListasdeExercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {

		int segundos, horas, minutos, x;

		Scanner leitura = new Scanner(System.in);

		System.out.print("Digite o tempo do evento em segundos:");
		x = leitura.nextInt();

		horas = x / 3600;
		minutos = (x % 3600) / 60;
		segundos = (x % 3600) % 60;

		System.out.println("\nHoras:" + horas);
		System.out.println("Minutos:" + minutos);
		System.out.println("Segundos:" + segundos);

	}
}
