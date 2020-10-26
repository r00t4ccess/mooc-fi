
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare magicSquare = new MagicSquare(size);

        int nextRow = 0;
        int nextCol = size / 2;
        magicSquare.placeValue(nextRow, nextCol, 1);
        for (int i = 2; i <= size * size; i++) {
            int thisRow = nextRow;
            int thisColumn = nextCol;
            nextRow -= 1;
            nextCol += 1;
            if (nextCol > size - 1) {
                nextCol = 0;
            }
            if (nextRow < 0) {
                nextRow = size - 1;
            }
            if (magicSquare.readValue(nextRow, nextCol) > 0) {
                nextRow = thisRow + 1;
                nextCol = thisColumn;
            }
            magicSquare.placeValue(nextRow, nextCol, i);
        }
        return magicSquare;
    }

}
