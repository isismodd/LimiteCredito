package listaExercicio_Controles;

import java.util.Scanner;
public class Cliente {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);

		int conta;
		int saldo;
		int cobranças;
		int creditos;
		int limite;
		int calculo;

		System.out.print("Digite o numero da conta: ");
		conta = input.nextInt();

		System.out.print("Digite o saldo do inicio do mes: ");
		saldo = input.nextInt();

		System.out.print("Digite o total dos itens cobrados: ");
		cobranças = input.nextInt();

		System.out.print("Digite o total de creditos aplicados: ");
		creditos = input.nextInt();

		System.out.print("Digite o limite de credito autorizado: ");
		limite = input.nextInt();

		calculo = saldo + creditos + limite - cobranças;

		System.out.printf("Seu novo saldo e de: %d\n", calculo);

		if (calculo>limite) {
		System.out.print("Limite de credito excedido!");
		}else
		System.out.print("Ainda tem limite de credito disponivel!");


		}

}
