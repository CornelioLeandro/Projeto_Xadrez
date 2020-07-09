package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);// OBS Interessante: Setamos aqui o Tabuleiro 8,8 pois é o tamanho padrao de um
										// tabuleiro de xadrez
		iniciarPartida(); // e também é a PartidaDeXadrez que tem que fica responsavel pelo tamanho do
							// Tabuleiro;
	}

	public PecaDeXadrez[][] getPecas() {// Feito um mat que é uma matriz de PecaDeXadrez que vai receber de tabuleiro a
										// linha e a coluna
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {// o for esta percorrendo toda a matriz de mat
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}

	private void lugarNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.LugarDaPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}

	private void iniciarPartida() {
		lugarNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
		lugarNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
		lugarNovaPeca('c', 2, new Torre(tabuleiro, Cor.BRANCO));
		lugarNovaPeca('d', 2, new Torre(tabuleiro, Cor.BRANCO));
		lugarNovaPeca('e', 2, new Torre(tabuleiro, Cor.BRANCO));
		lugarNovaPeca('e', 1, new Torre(tabuleiro, Cor.BRANCO));
		lugarNovaPeca('d', 1, new Rei(tabuleiro, Cor.BRANCO));

		lugarNovaPeca('c', 7, new Torre(tabuleiro, Cor.PRETO));
		lugarNovaPeca('c', 8, new Torre(tabuleiro, Cor.PRETO));
		lugarNovaPeca('d', 7, new Torre(tabuleiro, Cor.PRETO));
		lugarNovaPeca('e', 7, new Torre(tabuleiro, Cor.PRETO));
		lugarNovaPeca('e', 8, new Torre(tabuleiro, Cor.PRETO));
		lugarNovaPeca('d', 8, new Rei(tabuleiro, Cor.PRETO));
	}
}
