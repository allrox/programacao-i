import java.util.Scanner;

public class appCarro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/**
		 * Declara��o da vari�vel que receber� o novo objeto 
		 */
		Carro car1 = new Carro();
		
		
		/**
		 * Entrada dos dados utilizando Setters
		 */
		System.out.print("Informe o fabricante do autom�vel: ");
		car1.setFabricante(entrada.nextLine());
		
		System.out.print("Informe o modelo: ");
		car1.setModelo(entrada.nextLine());
		
		System.out.print("Informe a Cor: ");
		car1.setCor(entrada.nextLine());
		
		System.out.print("Informe a placa: ");
		car1.setPlaca(entrada.nextLine());
		
		System.out.print("Informe o valor: ");
		car1.setValor(Double.parseDouble(entrada.nextLine()));
		
		System.out.print("Informe o n�mero de portas: ");
		car1.setNumPortas(Integer.parseInt(entrada.nextLine()));
		
		System.out.print("Informe o ano de fabrica��o: ");
		car1.setAnoFabricacao(Integer.parseInt(entrada.next()));
		
		System.out.print("Informe o ano do modelo: ");
		car1.setAnoModelo(Integer.parseInt(entrada.next()));
		
		
		/** Resolve o aviso "Resource leak: is never closed", resultante do Scanner */
		entrada.close();
		
		/**
		 * Impress�o dos atributos atrav�s de Getter.
		 */
		car1.imprimir();

	}

}
