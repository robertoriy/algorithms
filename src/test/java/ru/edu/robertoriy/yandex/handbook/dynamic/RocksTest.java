package ru.edu.robertoriy.yandex.handbook.dynamic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

final class RocksTest {
    private RocksTest() {
    }

    @ParameterizedTest
    @DisplayName("Тест: Камни - (1, 0) | (0, 1) | (1, 1)")
    @CsvSource({
        "10, 2, Loose",
        "4, 5, Win",
        "6, 8, Loose"
    })
    void testRocksSimpleGame(int x, int y, String expected) {
        String actual = RocksUtils.play(new RocksUtils.Position(x, y));

        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Тест: Продвинутые камни - (1, 0) | (0, 1) | (2, 0) | (0, 2) | (2, 1) | (1, 2)")
    @CsvSource({
        "4, 4, Loose",
        "17, 72, Win",
        "7, 5, Win"
    })
    void testRocksAdvancedGame(int x, int y, String expected) {
        String actual = AdvancedRocksUtils.play(new AdvancedRocksUtils.Position(x, y));

        assertThat(actual).isEqualTo(expected);
    }
}
