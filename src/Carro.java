import java.util.Scanner;

public class Carro {

	String fabricante, modelo, cor, placa;
	double valor;
	int numPortas, anoFabricacao, anoModelo;
	
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter do Fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String $fab) {
		if(!$fab.isEmpty()) {
			fabricante = $fab;
		}
	}
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter do Modelo
	 */
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String $modelo){
		if(!$modelo.isEmpty()) {
			modelo = $modelo;
		}
	}
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter da Cor
	 */
	public String getCor() {
		return cor;
	}
	
	public void setCor(String $cor){
		if(!$cor.isEmpty()) {
			cor = $cor;
		}
	}
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter da Placa
	 */
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String $placa){
		if(!$placa.isEmpty()) {
			placa = $placa;
		}
	}
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter do Valor
	 */
	public double getValor() {
		return valor;
	}
	
	public void setValor(double $valor){
		if($valor>0) {
			valor = $valor;
		}
	}
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter do Número de Portas
	 */
	public int getNumPortas() {
		return numPortas;
	}
	
	public void setNumPortas(int $numPortas){
		if($numPortas>0) {
			numPortas = $numPortas;
		}
	}
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter do Ano de Fabricação
	 */
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int $anoFabricacao){
		if($anoFabricacao>1900) {
			anoFabricacao = $anoFabricacao;
		}
	}
	
	/**
	 * Métodos de atribuição e recuperação
	 * Getter e Setter do Ano do Modelo
	 */
	public int getAnoModelo() {
		return anoModelo;
	}
	
	public void setAnoModelo(int $anoModelo){
		if($anoModelo>1900) {
			anoModelo = $anoModelo;
		}
	}
	
	/**
	 * Método para imprimir os dados recebidos
	 */
	
	public void imprimir() {
		System.out.println("\n\nExibindo informações coletadas:");
		System.out.println("-------------------------------");
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("Modelo: " + getModelo());
		System.out.println("-------------------------------");
		System.out.println("Cor: " + getCor());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Valor: R$ " + getValor());
		System.out.println("Portas: " + getNumPortas());
		System.out.println("-------------------------------");
		System.out.println("Ano de Fabricação: " + getAnoFabricacao());
		System.out.println("Ano do Modelo: " + getAnoModelo());
	}
	
	public void entradaDados() {
		
		Scanner entrada = new Scanner(System.in);

		/**
		 * Entrada dos dados utilizando Setters
		 */
		System.out.print("Informe o fabricante do automóvel: ");
		setFabricante(entrada.nextLine());
		
		System.out.print("Informe o modelo: ");
		setModelo(entrada.nextLine());
		
		System.out.print("Informe a Cor: ");
		setCor(entrada.nextLine());
		
		System.out.print("Informe a placa: ");
		setPlaca(entrada.nextLine());
		
		System.out.print("Informe o valor: ");
		setValor(Double.parseDouble(entrada.nextLine()));
		
		System.out.print("Informe o número de portas: ");
		setNumPortas(Integer.parseInt(entrada.nextLine()));
		
		System.out.print("Informe o ano de fabricação: ");
		setAnoFabricacao(Integer.parseInt(entrada.next()));
		
		System.out.print("Informe o ano do modelo: ");
		setAnoModelo(Integer.parseInt(entrada.next()));
		
		entrada.close();
	}
	
}
