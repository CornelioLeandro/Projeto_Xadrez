package xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez { // essa classe vai ter "SISTEMA DE COORDENADA DA PECA" "NA PARTIDA" que vai ser por um "CHAR" e um "INT"

	private char coluna;
	private int linha;
	
	public PosicaoXadrez(char coluna, int linha) {
		if (coluna <'a' || coluna > 'h' || linha< 1 || linha >8 ){
			throw new ExceptionXadrez("Erro ao instaciar Posicao: Valores validos de a1 até h8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posicao toPosicao() {// vai converter as coordeanas a1 até h8 para as posicao das matrizes EX:(0,0)(0,1)(1,0)(1,1)...
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	protected static PosicaoXadrez dePosicao(Posicao posicao) {
		return new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return ""+ coluna + linha;
	}
	
}
