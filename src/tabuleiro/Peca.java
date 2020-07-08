package tabuleiro;

public class Peca {

	protected Posicao posicao; // uma pe�a vai ter posicao no tabuleiro.
	private Tabuleiro tabuleiro;// o tabuleiro � a plataforma para a peca.
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
}
