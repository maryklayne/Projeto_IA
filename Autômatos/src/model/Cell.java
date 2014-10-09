package model;

public class Cell {
	private String estado;
	private int linha, coluna;

	public Cell(){
		this.estado = "morta";
	}
	
	public Cell(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
		this.estado = "morta";
	}
	
	public Cell(int linha, int coluna, String estado){
		this.linha = linha;
		this.coluna = coluna;
		switch (estado){
		case "morta":
			this.estado = "morta";
			break;
		case "vivaa":
			this.estado = "vivaa";
			break;
		case "verde":
			this.estado = "verde";
			break;
		case "rrosa":
			this.estado = "rrosa";
			break;
		}
		
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String novoEstado) {
		switch (novoEstado){
		case "morta":
			this.estado = "morta";
			break;
		case "vivaa":
			this.estado = "vivaa";
			break;
		case "verde":
			this.estado = "verde";
			break;
		case "rrosa":
			this.estado = "rrosa";
			break;
		}	
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}


}