public class Carro {

	String fabricante, modelo, cor, placa;
	double valor;
	int numPortas, anoFabricacao, anoModelo;
	
	
	/**
	 * M�todos de atribui��o e recupera��o
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
	 * M�todos de atribui��o e recupera��o
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
	 * M�todos de atribui��o e recupera��o
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
	 * M�todos de atribui��o e recupera��o
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
	 * M�todos de atribui��o e recupera��o
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
	 * M�todos de atribui��o e recupera��o
	 * Getter e Setter do N�mero de Portas
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
	 * M�todos de atribui��o e recupera��o
	 * Getter e Setter do Ano de Fabrica��o
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
	 * M�todos de atribui��o e recupera��o
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
	
	public void imprimir() {
		System.out.println("\n\nExibindo informa��es coletadas:");
		System.out.println("-------------------------------");
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("Modelo: " + getModelo());
		System.out.println("-------------------------------");
		System.out.println("Cor: " + getCor());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Valor: R$ " + getValor());
		System.out.println("Portas: " + getNumPortas());
		System.out.println("-------------------------------");
		System.out.println("Ano de Fabrica��o: " + getAnoFabricacao());
		System.out.println("Ano do Modelo: " + getAnoModelo());
	}
	

}
