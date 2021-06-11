package oop.assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void passwordValidator_very_weak() {
        PasswordValidator pv = new PasswordValidator();
        int expected = 1;
        int actual = pv.passwordValidator("12345");

        assertEquals(expected, actual);

    }
    @Test
    void passwordValidator_weak() {
        PasswordValidator pv = new PasswordValidator();
        int expected = 2;
        int actual = pv.passwordValidator("abcdef");

        assertEquals(expected, actual);

    }
    @Test
    void passwordValidator_strong() {
        PasswordValidator pv = new PasswordValidator();
        int expected = 3;
        int actual = pv.passwordValidator("abc123xyz");

        assertEquals(expected, actual);

    }
    @Test
    void passwordValidator_very_strong() {
        PasswordValidator pv = new PasswordValidator();
        int expected = 4;
        int actual = pv.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);

    }
    @Test
    void specialCharChecker_has() {

       boolean actual = PasswordValidator.specialCharChecker("?!@#$@%^");
       assertTrue(actual);
    }
    @Test
    void specialCharChecker_has_not() {

        boolean actual = PasswordValidator.specialCharChecker("abcdefghijklmnopqrstuvwxyz1234567890");
        assertFalse(actual);
    }
}