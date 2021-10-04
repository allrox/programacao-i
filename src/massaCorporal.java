/**
 * Importação das classes para aplicação
 */
import java.util.Scanner;
import java.lang.Math;

public class massaCorporal {

	public static void main(String[] args) {

		/**
		 * Chamada para a classe de entrada de dados e criação das variáveis.	
		 */
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double peso,altura, imc;
		
		/**
		 * Exibição das mensagens ao usuário e entrada de dados 
		 */
		System.out.print("Informe o peso do indivíduo: ");
		peso = Double.parseDouble(scan.next());
		System.out.print("Informe a altura do indivíduo: ");
		altura = Double.parseDouble(scan.next());
		
		/**
		 * Cálculo do IMC e exibição na tela
		 */
		imc = Math.round(peso/(altura*altura));
		System.out.println("");
		System.out.println("O IMC do indivíduo é: "+imc);

	}

}
