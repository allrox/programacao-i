/**
 * Importa��o das classes para aplica��o
 */
import java.util.Scanner;
import java.lang.Math;

public class massaCorporal {

	public static void main(String[] args) {

		/**
		 * Chamada para a classe de entrada de dados e cria��o das vari�veis.	
		 */
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double peso,altura, imc;
		
		/**
		 * Exibi��o das mensagens ao usu�rio e entrada de dados 
		 */
		System.out.print("Informe o peso do indiv�duo: ");
		peso = Double.parseDouble(scan.next());
		System.out.print("Informe a altura do indiv�duo: ");
		altura = Double.parseDouble(scan.next());
		
		/**
		 * C�lculo do IMC e exibi��o na tela
		 */
		imc = Math.round(peso/(altura*altura));
		System.out.println("");
		System.out.println("O IMC do indiv�duo �: "+imc);

	}

}
