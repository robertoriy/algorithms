package ru.edu.robertoriy.leetcode.hashmap.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

final class HappyNumberTest {
    @ParameterizedTest
    @DisplayName("Тест: счастливое ли число (true)")
    @ValueSource(ints = {19, 7, 10, 13, 23, 28})
    void testIsHappyTrueCase(int number) {
        boolean actual = HappyNumber.isHappy(number);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: счастливое ли число (false)")
    @ValueSource(ints = {2, 4, 14, 16, 20})
    void testIsHappyFalseCase(int number) {
        boolean actual = HappyNumber.isHappy(number);

        assertThat(actual).isFalse();
    }
}
