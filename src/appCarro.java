
public class appCarro {

	public static void main(String[] args) {
		
//		Instanciando objetos com o construtor.
		
		Carro carro1 = new Carro("Fiat", "Argo", "Branco", "XB2625", 4, 50900, 2019, 2020);
		Carro carro2 = new Carro("Volkswagen", "Spacefox", "Prata", "DF8564", 4, 41890, 2015, 2015);
		Carro carro3 = new Carro("Ford", "Ecosport", "Branco", "XI2675", 4, 47890, 2014, 2015);
		Carro carro4 = new Carro("Toyota", "Corolla", "Preto", "FE2387", 4, 44999, 2011, 2011);
		Carro carro5 = new Carro("Honda", "Honda City", "Prata", "ER23467", 4, 43900, 2010, 2011);
		
//		carro1.entradaDados();
		
		
//		Exibindo os objetos através do uso do método imprimir.
		
		carro1.imprimir();
		carro2.imprimir();
		carro3.imprimir();
		carro4.imprimir();
		carro5.imprimir();

	}

}
