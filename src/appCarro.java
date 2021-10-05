import java.util.Scanner;

public class appCarro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/**
		 * Declaração da variável que receberá o novo objeto 
		 */
		Carro car1 = new Carro();
		
		
		/**
		 * Entrada dos dados utilizando Setters
		 */
		System.out.print("Informe o fabricante do automóvel: ");
		car1.setFabricante(entrada.nextLine());
		
		System.out.print("Informe o modelo: ");
		car1.setModelo(entrada.nextLine());
		
		System.out.print("Informe a Cor: ");
		car1.setCor(entrada.nextLine());
		
		System.out.print("Informe a placa: ");
		car1.setPlaca(entrada.nextLine());
		
		System.out.print("Informe o valor: ");
		car1.setValor(Double.parseDouble(entrada.nextLine()));
		
		System.out.print("Informe o número de portas: ");
		car1.setNumPortas(Integer.parseInt(entrada.nextLine()));
		
		System.out.print("Informe o ano de fabricação: ");
		car1.setAnoFabricacao(Integer.parseInt(entrada.next()));
		
		System.out.print("Informe o ano do modelo: ");
		car1.setAnoModelo(Integer.parseInt(entrada.next()));
		
		
		/** Resolve o aviso "Resource leak: is never closed", resultante do Scanner */
		entrada.close();
		
		/**
		 * Impressão dos atributos através de Getter.
		 */
		car1.imprimir();

	}

}
