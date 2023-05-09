package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	// A posição de uma peça recém criada é inicialmente nula (ainda não
	// foi colocada no tabuleiro), por isso o construtor abaixo contém
	// apenas "board", e não "position".
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
}
