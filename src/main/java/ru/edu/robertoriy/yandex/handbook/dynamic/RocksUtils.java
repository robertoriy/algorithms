package ru.edu.robertoriy.yandex.handbook.dynamic;

public final class RocksUtils {
    private RocksUtils() {
    }

    public static String play(Position position) {
        Cell[][] matrix = new Cell[position.height() + 1][position.width() + 1];
        matrix[0][0] = Cell.LOOSE;

        for (int i = 1; i <= position.width(); i++) {
            matrix[0][i] = matrix[0][i - 1] == Cell.WIN ? Cell.LOOSE : Cell.WIN;
        }

        for (int i = 1; i <= position.height(); i++) {
            matrix[i][0] = matrix[i - 1][0] == Cell.WIN ? Cell.LOOSE : Cell.WIN;
        }

        for (int j = 1; j <= position.height(); j++) {
            for (int i = 1; i <= position.width(); i++) {
                matrix[j][i] = hasWinningStrategy(new Position(i, j), matrix) ? Cell.WIN : Cell.LOOSE;
            }
        }

        return matrix[position.height()][position.width()].toString();
    }

    private static boolean hasWinningStrategy(Position currentPosition, Cell[][] matrix) {
        return matrix[currentPosition.height() - 1][currentPosition.width() - 1] == Cell.LOOSE
                || matrix[currentPosition.height() - 1][currentPosition.width()] == Cell.LOOSE
                || matrix[currentPosition.height()][currentPosition.width() - 1] == Cell.LOOSE;
    }

    enum Cell {
        WIN("Win"),
        LOOSE("Loose");

        private final String value;

        Cell(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public record Position(int width, int height) {
    }
}
