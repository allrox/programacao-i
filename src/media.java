//Classe para controle de entrada de dados
import java.util.Scanner;

public class media {

	public static void main(String[] args) {

		//Fun��o scan e declara��o de vari�veis
		Scanner scan = new Scanner(System.in);
		double media, n1, n2;
		
		//Entrada de dados
		System.out.print("Informe a primeira nota: ");
		n1 = Double.parseDouble(scan.next());
		System.out.print("Informe a segunda nota: ");
		n2 = Double.parseDouble(scan.next());
		
		//C�lculo e exibi��o
		media = (n1+n2)/2;		
		System.out.print("A m�dia das notas �: " + media);
		scan.close();
	}

}
