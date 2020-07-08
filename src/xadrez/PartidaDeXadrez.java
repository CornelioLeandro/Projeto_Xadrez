package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);// OBS Interessante: Setamos aqui o Tabuleiro 8,8 pois é o tamanho padrao de um tabuleiro de xadrez
										// e também é a PartidaDeXadrez que tem que fica responsavel pelo tamanho do Tabuleiro;
	}
	
	public PecaDeXadrez[][] getPecas(){// Feito um mat que é uma matriz de PecaDeXadrez que vai receber de tabuleiro a linha e a coluna
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {// o for esta percorrendo toda a matriz de mat
			for (int j=0; j<tabuleiro.getColunas(); j++ ) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}

}
