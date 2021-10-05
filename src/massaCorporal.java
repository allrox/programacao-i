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
		
		System.out.println("\rO IMC do indivíduo é: "+imc);
		
		/**
		 * Verificação do IMC de acordo com os parâmetros para adultos, com idade entre 20 e 65 anos
		 */
		if(imc <= 10) {
			System.out.println("O resultado indica possível Desnutrição Grau V.");
		} else if(imc < 13) {
			System.out.println("O resultado indica possível Desnutrição Grau IV.");
		} else if(imc < 16) {
			System.out.println("O resultado indica possível Desnutrição Grau III.");
		} else if(imc < 17) {
			System.out.println("O resultado indica possível Desnutrição Grau II.");
		} else if(imc < 18.5) {
			System.out.println("O resultado indica possível Desnutrição Grau I.");
		} else if(imc < 25) {
			System.out.println("O resultado apresenta o IMC considerado normal.");
		} else if(imc < 30) {
			System.out.println("O resultado indica possível Pré-obesidade.");
		} else if(imc < 34.6) {
			System.out.println("O resultado indica possível Obesidade Grau I.");
		} else if(imc < 40) {
			System.out.println("O resultado indica possível Obesidade Grau II.");			
		} else {
			System.out.println("O resultado indica possível Obesidade Grau III.");	
		}
		
	}

}
