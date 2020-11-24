package wildercoding.chess

class Knight(color:Color): Piece(PieceType.KNIGHT,color) {


    override fun generateMovesList(location: Coord): List<Coord> {
        val possibleMoves= arrayListOf<Coord?>()
        possibleMoves.add(Coord.getValidatedCoord(location.file+2,location.rank+1))
        possibleMoves.add(Coord.getValidatedCoord(location.file+2,location.rank-1))
        possibleMoves.add(Coord.getValidatedCoord(location.file-2,location.rank+1))
        possibleMoves.add(Coord.getValidatedCoord(location.file-2,location.rank-1))

        possibleMoves.add(Coord.getValidatedCoord(location.file+1,location.rank+2))
        possibleMoves.add(Coord.getValidatedCoord(location.file+1,location.rank-2))
        possibleMoves.add(Coord.getValidatedCoord(location.file-1,location.rank+2))
        possibleMoves.add(Coord.getValidatedCoord(location.file-1,location.rank-2))
        return possibleMoves.filterNotNull()
    }
}
