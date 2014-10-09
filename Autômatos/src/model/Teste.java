package model;


public class Teste {

	public static void main(String[] args) {
//		Cell a  = new Cell(2,2, "vivaa");
//		Cell b  = new Cell(3,4, "rrosa");
//		Cell c  = new Cell(2,3, "verde");
//		Cell d  = new Cell(5,3, "verde");
//		
//		Automato automato = new Automato("neumann");
//		automato.addCelula(a);
//		automato.addCelula(b);
//		automato.addCelula(c);
//		automato.addCelula(d);
//		
//		
//		ArrayList<Cell> cel = automato.vizinhos(automato.getVizinhanca(),automato.getMatriz()[5][5]);
//		
//		for(int i = 0 ; i < cel.size() ; i++){
//			System.out.println(cel.get(i).getEstado());
//			
//		}
//		
////		System.out.println(a.getEstado());
//		System.out.println("\n\n");
//		automato.imprimi();
		
		String texto = "If celula = viva and vizinhos = 3 "
				+ "then celula morre";
		
		BuscarRegras bb = new BuscarRegras();
		
		bb.setRegra(texto);
		
//		System.out.println(bb.getRegra());
		
		bb.imprimir();


	}

}
