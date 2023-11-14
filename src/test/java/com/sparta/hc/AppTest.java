package com.sparta.hc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
    //annotations contains metadata (information about information)
    //classes can have the same name, provided they live in different packages
    @Test
    @DisplayName("Check that 6 returns \"Good Morning!\"")
    public void firstTest() {
        Assertions.assertEquals("Good Morning!", App.getGreeting(6));
    }

    @Test
    @DisplayName("Check that 4 returns \"Good Evening!\"")
    public void secondCheck() {
        Assertions.assertEquals("Good Evening!", App.getGreeting(4));
    }

    @Test
    @DisplayName("Check that 19 returns \"Good Evening!\"")
    public void fourthCheck() {
        Assertions.assertEquals("Good Evening!", App.getGreeting(19));
    }

    @ParameterizedTest //Junit Annotation - This is a test
    @ValueSource(ints = {5, 8 , 12, 100, 14, -1}) // source of parameters
    @DisplayName("Check against 5, 8 and 12")
    public void checkAgainst5_8_and_12(int timeOfDay) {
        Assertions.assertEquals("Good Morning!", App.getGreeting(timeOfDay));
    }

}
