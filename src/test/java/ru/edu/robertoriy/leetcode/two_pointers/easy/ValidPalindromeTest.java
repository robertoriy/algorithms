package ru.edu.robertoriy.leetcode.two_pointers.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

final class ValidPalindromeTest {
    @ParameterizedTest
    @DisplayName("Тест: является ли палиндромом (true)")
    @ValueSource(strings = {"A man, a plan, a canal: Panama", " "})
    void testIsPalindromeTrueCase(String input) {
        boolean actual = ValidPalindrome.isPalindrome(input);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: является ли палиндромом (false)")
    @ValueSource(strings = {"race a car"})
    void testIsPalindromeFalseCase(String input) {
        boolean actual = ValidPalindrome.isPalindrome(input);

        assertThat(actual).isFalse();
    }
}
