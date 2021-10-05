import java.util.Scanner;

public class numerosPrimos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero, contador=0;
		
		System.out.print("Informe o número para análise: ");
		numero = Integer.parseInt(scan.nextLine());
		scan.close();

		/*
		Bloco utilizado originalmente na aula
			
		for(int i=1 ; i<=numero ; i++) {
			if(numero % i == 0) {
				System.out.print(numero/i+" ");
				contador++;
			}
		}
		
		*/
		
		/**
		 * Bloco ajustado para exibir os divisíveis localizados
		 */
		System.out.print("\rDivisíveis localizados: { ");
		for(int i=numero ; i>=1 ; i--) {
			if(numero % i == 0) {
				System.out.print(numero/i+", ");
				contador++;
			}
		}
		System.out.print("}");
		if(contador == 2) {
			System.out.println("\n\nO número informado é um número primo,\ndivisível apenas por 1 e por ele mesmo.");
		} else {
			System.out.println("\n\nO número informado não é um número primo.\n"+contador+" números divisíveis por "+numero+" foram encontrados.");
		} 		

	}

}
