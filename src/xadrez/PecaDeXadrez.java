package xadrez;

import java.awt.Color;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaDeXadrez extends Peca {

	private Color color;

	public PecaDeXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
