package aplication;

import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class UI {

	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void mostraTabuleiro(PecaDeXadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) { // enquanto i for a posicao da matriz pecas
			System.out.print((8 - i) + " ");//
			for (int j = 0; j < pecas.length; j++) {
				exibiPeca(pecas[i][j]);
			}
			System.out.println("");// coloca espaco no final de cada linha
		}
		System.out.println("");
		System.out.println("  a b c d e f g h");

	}

	private static void exibiPeca(PecaDeXadrez pecas) {
		if (pecas == null) {
			System.out.print("-"); // se n�o tiver nenhuma pe�a setada ele vai colocar "-" na matriz de pecas
		} else {
			if (pecas.getColor() == Cor.BRANCO) {
				System.out.print(ANSI_WHITE + pecas + ANSI_RESET);
			} else {
				System.out.print(ANSI_YELLOW + pecas + ANSI_RESET);
			}
		}
		System.out.print(" ");
	}
}
