package ru.edu.robertoriy.leetcode.hashmap.easy;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

final class ContainsDuplicateSecondTest {
    @ParameterizedTest
    @DisplayName("Тест: содержатся ли в массиве дубликаты на расстоянии не более k (true)")
    @MethodSource("provideArgumentsTrueCase")
    void testContainsNearbyDuplicateTrueCase(int[] nums, int k) {
        boolean actual = ContainsDuplicateSecond.containsNearbyDuplicate(nums, k);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: содержатся ли в массиве дубликаты на расстоянии не более k (false)")
    @MethodSource("provideArgumentsFalseCase")
    void testContainsNearbyDuplicateFalseCase(int[] nums, int k) {
        boolean actual = ContainsDuplicateSecond.containsNearbyDuplicate(nums, k);

        assertThat(actual).isFalse();
    }

    private static Stream<Arguments> provideArgumentsTrueCase() {
        return Stream.of(
            Arguments.of(
                new int[] {1, 2, 3, 1}, 3
            ),
            Arguments.of(
                new int[] {1, 0, 1, 1}, 1
            ),
            Arguments.of(
                new int[] {3, 2, 1, 2, 1, 3}, 2
            ),
            Arguments.of(
                new int[] {2, 4, 6, 8, 10, 2}, 5
            ),
            Arguments.of(
                new int[] {5, 3, 7, 5, 9, 2, 7}, 3
            )
        );
    }

    private static Stream<Arguments> provideArgumentsFalseCase() {
        return Stream.of(
            Arguments.of(
                new int[] {1, 2, 3, 1, 2, 3}, 2
            ),
            Arguments.of(
                new int[] {1, 2, 3, 4, 5}, 1
            ),
            Arguments.of(
                new int[] {4, 7, 2, 8, 1}, 3
            ),
            Arguments.of(
                new int[] {5, 2, 1, 9, 4, 5, 8}, 2
            ),
            Arguments.of(
                new int[] {3, 6, 9, 12, 15}, 4
            ),
            Arguments.of(
                new int[] {1, 3, 5, 7, 9}, 2
            )
        );
    }
}
