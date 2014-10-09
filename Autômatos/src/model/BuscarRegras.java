package model;

public class BuscarRegras {

	private String regra;
	private String[] regrasLista;
	
	
	BuscarRegras(){
	}
	
	public String[] getRegrasLista() {
		return regrasLista;
	}

	public String getRegra() {
		return regra;
	}

	public void setRegra(String regra) {
		this.regra = regra;
	}

	public void setRegrasLista(String[] regras) {
		this.regrasLista = regras;
	}
	
	void imprimir(){
		for(int x = 0 ; x < this.regrasLista.length ; x++){
			System.out.println(this.regrasLista[x]);
		}
	}
	

		
	
		
	


		
}
