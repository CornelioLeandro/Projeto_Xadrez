package aplication;

import xadrez.PecaDeXadrez;

public class UI {

	public static void mostraTabuleiro(PecaDeXadrez[][] pecas) {
		for (int i=0; i<pecas.length; i++) { // OBSERVAR MAIS ESSSE PARTE
			System.out.print((8 - i) + " ");
			for (int j=0; j<pecas.length; j++) {
				exibiPeca(pecas[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("  a b c d e f g h");
		
	}
	
	private static void exibiPeca(PecaDeXadrez pecas) {
		if(pecas == null) {
			System.out.print("-");
		}else {
			System.out.print(pecas);
		}
		System.out.print(" ");
	}
}
