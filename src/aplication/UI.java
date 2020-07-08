package aplication;

import xadrez.PecaDeXadrez;

public class UI {

	public static void mostraTabuleiro(PecaDeXadrez[][] pecas) {
		for (int i=0; i<pecas.length; i++) { // enquanto i for a posicao da matriz pecas
			System.out.print((8 - i) + " ");// 
			for (int j=0; j<pecas.length; j++) {
				exibiPeca(pecas[i][j]);
			}
			System.out.println("");// coloca espaco no final de cada linha
		}
		System.out.println("");
		System.out.println("  a b c d e f g h");
		
	}
	
	private static void exibiPeca(PecaDeXadrez pecas) {
		if(pecas == null) {
			System.out.print("-"); // se não tiver nenhuma peça setada ele vai colocar "-" na matriz de pecas
		}else {
			System.out.print(pecas);// se tiver vai colocar a Letra REPRESENTANTE da Peca
		}
		System.out.print(" ");
	}
}
