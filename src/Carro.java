import java.util.Scanner;

public class Carro {

	String fabricante, modelo, cor, placa;
	double valor;
	int numPortas, anoFabricacao, anoModelo;
	
//	Este construtor vazio permite a construção do objeto
//	através dos setters diretamente na aplicação (main)
	
	public Carro() {}
	
	/**
	 * Este construtor define a estrutura de parâmetros para construção do objeto.
	 * @param fabricante
	 * @param modelo
	 * @param cor
	 * @param placa
	 * @param numPortas
	 * @param valor
	 * @param anoFabricacao
	 * @param anoModelo
	 */
	
	public Carro(String fabricante, String modelo, String cor, String placa, 
			int numPortas, int valor, int anoFabricacao, int anoModelo) {
			this.setFabricante(fabricante);
			this.setModelo(modelo);
			this.setCor(cor);
			this.setPlaca(placa);
			this.setNumPortas(numPortas);
			this.setValor(valor);
			this.setAnoFabricacao(anoFabricacao);
			this.setAnoModelo(anoModelo);
	}
	
	
//	Métodos de atribuição e recuperação Getters e Setters
	 
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String $fab) {
		if(!$fab.isEmpty()) {
			fabricante = $fab;
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String $modelo){
		if(!$modelo.isEmpty()) {
			modelo = $modelo;
		}
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String $cor){
		if(!$cor.isEmpty()) {
			cor = $cor;
		}
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String $placa){
		if(!$placa.isEmpty()) {
			placa = $placa;
		}
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double $valor){
		if($valor>0) {
			valor = $valor;
		}
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	
	public void setNumPortas(int $numPortas){
		if($numPortas>0) {
			numPortas = $numPortas;
		}
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int $anoFabricacao){
		if($anoFabricacao>1900) {
			anoFabricacao = $anoFabricacao;
		}
	}
	
	public int getAnoModelo() {
		return anoModelo;
	}
	
	public void setAnoModelo(int $anoModelo){
		if($anoModelo>1900) {
			anoModelo = $anoModelo;
		}
	}
	
	
//	Método para impressão dos dados recebidos na aplicação (main)
	 
	public void imprimir() {
		System.out.println("Informações do automóvel:");
		System.out.println("-----------------------------------");
		System.out.println("Fabricante:\t\t" + getFabricante());
		System.out.println("Modelo:\t\t\t" + getModelo());
		System.out.println("-----------------------------------");
		System.out.println("Cor:\t\t\t" + getCor());
		System.out.println("Placa:\t\t\t" + getPlaca());
		System.out.println("Portas:\t\t\t" + getNumPortas());
		System.out.println("Valor:\t\t\tR$ " + getValor());
		System.out.println("-----------------------------------");
		System.out.println("Ano de Fabricação:\t" + getAnoFabricacao());
		System.out.println("Ano do Modelo:\t\t" + getAnoModelo());
		System.out.println("\n");
	}
	
	
//	Método para realizar entrada de dados na aplicação (main)
	
	public void entradaDados() {
		
		
//		Definindo a para entrada de dados com a classe Scanner
		 
		Scanner entrada = new Scanner(System.in);

		/* Entrada dos dados utilizando Setters */
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
