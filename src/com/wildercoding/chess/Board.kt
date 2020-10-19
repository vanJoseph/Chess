package wildercoding.chess

class Board {

    var squareInit=  { _:Int ->Square(Coord(0, 0), null)}

    var board=Array(8){Array<Square>(8,squareInit) }

    fun initNewGame(){
        addPawns()
        addRooks()
        addKnights()
        addBishops()
        addKings()
        addQueens()
    }

    private fun addPawns() {
        for (y in 0..7){
            board[1][y].piece=Pawn(Player.WHITE)
            board[6][y].piece=Pawn(Player.BLACK)
        }
    }
    private fun addRooks() {
        board[0][0].piece = Rook(Player.WHITE)
        board[0][7].piece = Rook(Player.WHITE)

        board[7][0].piece = Rook(Player.BLACK)
        board[7][7].piece = Rook(Player.BLACK)
    }
    private fun addKnights() {
        board[0][1].piece = Knight(Player.WHITE)
        board[0][6].piece = Knight(Player.WHITE)

        board[7][1].piece = Knight(Player.BLACK)
        board[7][6].piece = Knight(Player.BLACK)
    }
    private fun addBishops() {
        board[0][2].piece = Bishop(Player.WHITE)
        board[0][5].piece = Bishop(Player.WHITE)

        board[7][2].piece = Bishop(Player.BLACK)
        board[7][5].piece = Bishop(Player.BLACK)
    }
    private fun addQueens() {
        board[0][3].piece = Queen(Player.WHITE)

        board[7][3].piece = Queen(Player.BLACK)
    }
    private fun addKings() {
        board[0][4].piece = King(Player.WHITE)

        board[7][4].piece = King(Player.BLACK)
    }
    override fun toString(): String {
         var boardString:String= String()
        for (x in 7 downTo 0) {
            for (y in 0..7) {
                var pieceType=String()
                if(board[x][y].piece!=null) {
                    pieceType= board[x][y].piece?.piece.toString()
                }else{
                    pieceType="None"
                }
                boardString+="$pieceType:($x,$y)\t"
            }
            boardString+="\n"
        }
        return boardString
    }

}