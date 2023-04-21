package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void laengePruefen_svenjakl() {
        //GIVEN
        String a = "svenjakl";
        //WHEN
        boolean actual = Main.laengePruefen(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void laengePruefen_svenja() {
        //GIVEN
        String a = "svenja";
        //WHEN
        boolean actual = Main.laengePruefen(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void laengePruefen_svenjaklenke() {
        //GIVEN
        String a = "svenjaklenke";
        //WHEN
        boolean actual = Main.laengePruefen(a);
        //THEN
        assertTrue(actual);
    }
}