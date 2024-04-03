package ru.edu.robertoriy.yandex.handbook.greedy;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

final class GreedyTest {
    @ParameterizedTest
    @DisplayName("Тест: Бронирование переговорки - наибольшее количество непересекающихся отрезков")
    @MethodSource("provideLineSegments")
    void testCombinationNoRepetitionNormalCase(List<GreedyUtils.Pair> pairs, int expected) {
        int actual = GreedyUtils.numberOfBookings(pairs);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provideLineSegments() {
        return Stream.of(
            Arguments.of(
                List.of(
                    new GreedyUtils.Pair(1, 3),
                    new GreedyUtils.Pair(2, 3),
                    new GreedyUtils.Pair(4, 5)
                ),
                2
            ),
            Arguments.of(
                List.of(
                    new GreedyUtils.Pair(1, 2),
                    new GreedyUtils.Pair(2, 3),
                    new GreedyUtils.Pair(4, 5),
                    new GreedyUtils.Pair(4, 5),
                    new GreedyUtils.Pair(5, 6)
                ),
                2
            ),
            Arguments.of(
                List.of(
                    new GreedyUtils.Pair(1, 50),
                    new GreedyUtils.Pair(49, 50)
                ),
                1
            )
        );
    }

}
