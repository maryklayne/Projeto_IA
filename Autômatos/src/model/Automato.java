package model;
import java.util.ArrayList;

public class Automato {
	private Cell matriz[][];
//	private int tamanhoDaMatriz;
	private String vizinhanca;
	private ArrayList<Cell> lista;
	
	
	public Automato(String vizinhanca) {
//		tamanhoDaMatriz = 10;
		this.vizinhanca = vizinhanca;
		this.lista = new ArrayList<Cell>();
		this.matriz = new Cell[10][10]; 
		for(int i = 0 ; i < 10 ; i++){	
			for(int j = 0 ; j < 10 ; j++){
				this.matriz[i][j] = new Cell(i,j);	
			}
		}
	}
	
	void addCelula(Cell celula){
		int linha = celula.getLinha();
		int coluna = celula.getColuna();
		this.matriz[linha][coluna] = celula;
	}
	
	public Cell[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Cell[][] matriz) {
		this.matriz = matriz;
	}

	public ArrayList<Cell> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cell> lista) {
		this.lista = lista;
	}

	public String getVizinhanca() {
		return vizinhanca;
	}
	
	ArrayList<Cell> vizinhosNeumann(Cell celula){
		this.lista.add(matriz[celula.getLinha()-1][celula.getColuna()]);
		this.lista.add(matriz[celula.getLinha()][celula.getColuna()-1]);
		this.lista.add(matriz[celula.getLinha()][celula.getColuna()+1]);
		this.lista.add(matriz[celula.getLinha()+1][celula.getColuna()]);
		return lista;
	}
	

	private ArrayList<Cell> vizinhosMoore(Cell celula) {
		vizinhosNeumann(celula);
		this.lista.add(matriz[celula.getLinha()-1][celula.getColuna()-1]);
		this.lista.add(matriz[celula.getLinha()-1][celula.getColuna()+1]);
		this.lista.add(matriz[celula.getLinha()+1][celula.getColuna()-1]);
		this.lista.add(matriz[celula.getLinha()+1][celula.getColuna()+1]);
		return lista;
	}
	
	void imprimi(){
		for(int i = 0 ; i < 10 ; i++){
			for(int x = 0 ; x < 10 ; x++){
				System.out.print(matriz[i][x].getEstado()+" ");
			}System.out.println("\n");
		}
	}
	
	ArrayList<Cell> vizinhos(String vizinhanca, Cell celula){
		if(vizinhanca.equals("neumann")){
			return vizinhosNeumann(celula);
		}
		return vizinhosMoore(celula);
	}

	
}
