package com.sparta.hc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7})
    @DisplayName("checkFilmClassificationForAll")
    public void checkFilmClassificationForAll(int ageOfViewer) {
        Assertions.assertEquals("U films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = { 8, 9, 10, 11})
    @DisplayName("checkFilmClassificationForPG")
    public void checkFilmClassificationForPG(int ageOfViewer) {
        Assertions.assertEquals("U & PG films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("checkFilmClassificationFor12AndOver")
    public void checkFilmClassificationFor12AndOver(int ageOfViewer) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("checkFilmClassificationFor15AndOver")
    public void checkFilmClassificationFor15AndOver(int ageOfViewer) {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 21, 100,})
    @DisplayName("checkFilmClassificationFor18AndOver")
    public void checkFilmClassificationFor18AndOver(int ageOfViewer) {
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(ageOfViewer));
    }

}
