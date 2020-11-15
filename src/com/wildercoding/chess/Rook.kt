package wildercoding.chess

class Rook(color: Player) : Piece(PieceType.ROOK, color) {

    override fun generateMovesList(): List<Coord> {
        val possibleLocations = arrayListOf<Coord?>()
        // Get the ranked squares
        for (i in 0..7) {
            possibleLocations.add(Coord(i, location.rank))
        }
        // Get the filed squares
        for (i in 0..7) {
            possibleLocations.add(Coord(location.file, i))
        }
        return validateLocation(possibleLocations)
    }


}