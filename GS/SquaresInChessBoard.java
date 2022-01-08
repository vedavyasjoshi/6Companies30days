package GS;

public class SquaresInChessBoard {
	static Long squaresInChessBoard(Long N) {
        // code here
        return N*(N+1)*(2*N+1)/6;
    }
}
