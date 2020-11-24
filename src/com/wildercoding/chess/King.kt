package wildercoding.chess

class King(color:Color):Piece(PieceType.KING,color) {
    override fun generateMovesList(position:Coord): List<Coord> {
       val possibleMoves = arrayListOf<Coord?>()

        possibleMoves.add(Coord.getValidatedCoord(position.file+1, position.rank) ?:null)
        possibleMoves.add(Coord.getValidatedCoord(position.file+1, position.rank-1) ?:null)
        possibleMoves.add(Coord.getValidatedCoord(position.file+1, position.rank+1) ?:null)

        possibleMoves.add(Coord.getValidatedCoord(position.file-1, position.rank) ?:null)
        possibleMoves.add(Coord.getValidatedCoord(position.file-1, position.rank-1) ?:null)
        possibleMoves.add(Coord.getValidatedCoord(position.file-1, position.rank+1) ?:null)

        possibleMoves.add(Coord.getValidatedCoord(position.file, position.rank+1) ?:null)
        possibleMoves.add(Coord.getValidatedCoord(position.file, position.rank-1) ?:null)

        return possibleMoves.filterNotNull()
    }
}