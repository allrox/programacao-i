import java.util.Scanner;

public class numerosPrimos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero, contador=0;
		
		System.out.print("Informe o n�mero para an�lise: ");
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
		 * Bloco ajustado para exibir os divis�veis localizados
		 */
		System.out.print("\rDivis�veis localizados: { ");
		for(int i=numero ; i>=1 ; i--) {
			if(numero % i == 0) {
				System.out.print(numero/i+", ");
				contador++;
			}
		}
		System.out.print("}");
		if(contador == 2) {
			System.out.println("\n\nO n�mero informado � um n�mero primo,\ndivis�vel apenas por 1 e por ele mesmo.");
		} else {
			System.out.println("\n\nO n�mero informado n�o � um n�mero primo.\n"+contador+" n�meros divis�veis por "+numero+" foram encontrados.");
		} 		

	}

}
