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
    void testRocksGameNormalCase(int x, int y, String expected) {
        String actual = RocksUtils.play(new RocksUtils.Position(x, y));

        assertThat(actual).isEqualTo(expected);
    }
}
