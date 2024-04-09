package ru.edu.robertoriy.yandex.handbook.dynamic;

public final class AdvancedRocksUtils {
    private static final int DEFAULT_LENGTH_TO_FILL = 3;
    private static final int LOSING_POSITION = 3;

    private AdvancedRocksUtils() {
    }

    public static String play(Position position) {
        if (position.height() <= 2 || position.width() <= 2) {
            return Cell.WIN.toString();
        }

        Cell[][] matrix = new Cell[position.height() + 1][position.width() + 1];

        for (int j = 0; j < DEFAULT_LENGTH_TO_FILL; j++) {
            for (int i = 0; i <= position.width(); i++) {
                matrix[j][i] = (j == 0 && i % LOSING_POSITION == 0) ? Cell.LOOSE : Cell.WIN;
            }
        }

        for (int j = 0; j <= position.height(); j++) {
            for (int i = 0; i < DEFAULT_LENGTH_TO_FILL; i++) {
                matrix[j][i] = (i == 0 && j % LOSING_POSITION == 0) ? Cell.LOOSE : Cell.WIN;
            }
        }

        for (int j = DEFAULT_LENGTH_TO_FILL; j <= position.height(); j++) {
            for (int i = DEFAULT_LENGTH_TO_FILL; i <= position.width(); i++) {
                matrix[j][i] = hasWinningStrategy(new Position(i, j), matrix) ? Cell.WIN : Cell.LOOSE;
            }
        }

        return matrix[position.height()][position.width()].toString();
    }

    private static boolean hasWinningStrategy(Position currentPosition, Cell[][] matrix) {
        return matrix[currentPosition.height() - 1][currentPosition.width()] == Cell.LOOSE
            || matrix[currentPosition.height()][currentPosition.width() - 1] == Cell.LOOSE
            || matrix[currentPosition.height() - 2][currentPosition.width()] == Cell.LOOSE
            || matrix[currentPosition.height()][currentPosition.width() - 2] == Cell.LOOSE
            || matrix[currentPosition.height() - 2][currentPosition.width() - 1] == Cell.LOOSE
            || matrix[currentPosition.height() - 1][currentPosition.width() - 2] == Cell.LOOSE;
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
