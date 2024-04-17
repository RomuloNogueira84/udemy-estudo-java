import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ola mundo!Rumo a nossa vitória!");

		// Operadores Aritméticos
		System.out.println((3 + 2 * 4));
		System.out.println((3 + 2) * 4);
		System.out.println(60 / (3 + 2) * 4);
		System.out.println(60 / ((3 + 2) * 4));
		System.out.println(14 % 3);
		System.out.println(19 % 4);
		System.out.println(25 % 7);

		// Declaração de variáveis
		// <tipo> <nome> = <valor inicial>;
		// int idade = 25;
		double altura = 1.68;
		char sexo = 'F';

		/*
		 * - Uma variável possui:
		 * - Nome(ou identificador)
		 * - Tipo
		 * - Valor
		 * - Endereço
		 */

		// Saida de dados em Java
		System.out.print("Boa noite!");
		System.out.println(", meu amigo!");

		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		// Exemplo 1:
		System.out.println("RESULTADO = " + x + " METROS ");

		// Exemplo 2:
		System.out.printf(" RESULTADO = %.2f metros%n", x);

		// Exemplo 3:
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ % .2f reais%n", nome, idade, renda);

	}
}
