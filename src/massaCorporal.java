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
		
		System.out.println("\rO IMC do indiv�duo �: "+imc);
		
		/**
		 * Verifica��o do IMC de acordo com os par�metros para adultos, com idade entre 20 e 65 anos
		 */
		if(imc <= 10) {
			System.out.println("O resultado indica poss�vel Desnutri��o Grau V.");
		} else if(imc < 13) {
			System.out.println("O resultado indica poss�vel Desnutri��o Grau IV.");
		} else if(imc < 16) {
			System.out.println("O resultado indica poss�vel Desnutri��o Grau III.");
		} else if(imc < 17) {
			System.out.println("O resultado indica poss�vel Desnutri��o Grau II.");
		} else if(imc < 18.5) {
			System.out.println("O resultado indica poss�vel Desnutri��o Grau I.");
		} else if(imc < 25) {
			System.out.println("O resultado apresenta o IMC considerado normal.");
		} else if(imc < 30) {
			System.out.println("O resultado indica poss�vel Pr�-obesidade.");
		} else if(imc < 34.6) {
			System.out.println("O resultado indica poss�vel Obesidade Grau I.");
		} else if(imc < 40) {
			System.out.println("O resultado indica poss�vel Obesidade Grau II.");			
		} else {
			System.out.println("O resultado indica poss�vel Obesidade Grau III.");	
		}
		
	}

}
