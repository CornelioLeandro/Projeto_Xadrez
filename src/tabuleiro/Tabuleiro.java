package tabuleiro;

public class Tabuleiro {

	private int linhas;// um tabuleiro vai conter linhas e colunas para que a peca possa se mover
	private int colunas;
	private Peca[][] pecas; // varias pecas vão ser posicionada dentro de uma quantidade de linhas dentro do tabuleiro
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(int linha , int coluna) {// vai setar a peça na linha e coluna informada no parametro
		return pecas[linha][coluna];
	}
	public Peca peca(Posicao posicao) { // vai retorna a peca pela posicao
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	
	
	
}
