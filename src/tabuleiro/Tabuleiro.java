package tabuleiro;

public class Tabuleiro {

	private int linhas;// um tabuleiro vai conter linhas e colunas para que a peca possa se mover
	private int colunas;
	private Peca[][] pecas; // varias pecas v�o ser posicionada dentro de uma quantidade de linhas dentro do tabuleiro
	
	public Tabuleiro(int linhas, int colunas) {
		if( linhas < 1 || colunas < 1 ) {
			throw new ExceptionTabuleiro("Erro ao criar Tabuleiro: � necessario ter pelo menos 1 linha ou uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linha , int coluna) {// vai setar a pe�a na linha e coluna informada no parametro
		if(!posicaoExiste(linha,coluna)) {
			throw new ExceptionTabuleiro("Posicao n�o existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) { // vai retorna a peca pela posicao
		if(!posicaoExiste(posicao)) {
			throw new ExceptionTabuleiro("Posicao n�o existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void LugarDaPeca(Peca peca, Posicao posicao) {// vai ser informado qual pe�a e a posicao dela, vai receber por parametro
		if(temUmaPeca(posicao)) {
			throw new ExceptionTabuleiro("Tem uma pe�a nessa posi��o " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca; // lembrando "pecas" � a matriz de Pe�a
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(int linha, int coluna) { // esta verificando quando uma posicao existe
	 return	linha >= 0 && linha < linhas && coluna >=0 && coluna < colunas;
	}
	public boolean posicaoExiste(Posicao posicao) { // com base na funcao de cima "posicao Existe" retorna a posicao.
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new ExceptionTabuleiro("Posicao n�o existe no tabuleiro");
		}
		return peca(posicao) !=null; // lembrando que essa peca(posicao) � o "Peca peca(Posicao posicao)"
	}
	
}
