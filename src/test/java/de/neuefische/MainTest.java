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

    @Test
    void zahlPruefen_svenjakl1() {
        //GIVEN
        String a = "svenjakl1";
        //WHEN
        boolean actual = Main.zahlPruefen(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void zahlPruefen_svenjakl() {
        //GIVEN
        String a = "svenjakl";
        //WHEN
        boolean actual = Main.zahlPruefen(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void beidesPruefen_svenjakl22() {
        //GIVEN
        String a = "svenjakl22";
        //WHEN
        boolean actual = Main.beidesPruefen(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void beidesPruefen_svenjakl() {
        //GIVEN
        String a = "svenjakl";
        //WHEN
        boolean actual = Main.beidesPruefen(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void kleineBuchstaben_svenjakl() {
        //GIVEN
        String a = "svenjakl";
        //WHEN
        boolean actual = Main.kleineBuchstaben(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void kleineBuchstaben_SVENJAKL() {
        //GIVEN
        String a = "SVENJAKL";
        //WHEN
        boolean actual = Main.kleineBuchstaben(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void kleineBuchstaben_SVENJAkl() {
        //GIVEN
        String a = "SVENJAkl";
        //WHEN
        boolean actual = Main.grosseBuchstaben(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void grosseBuchstaben_SVENJAKL() {
        //GIVEN
        String a = "SVENJAKL";
        //WHEN
        boolean actual = Main.grosseBuchstaben(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void grosseBuchstaben_svenjakl() {
        //GIVEN
        String a = "svenjakl";
        //WHEN
        boolean actual = Main.grosseBuchstaben(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void grosseBuchstaben_svenjaKL() {
        //GIVEN
        String a = "svenjaKL";
        //WHEN
        boolean actual = Main.grosseBuchstaben(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void beidesBuchstaben_svenjaKL() {
        //GIVEN
        String a = "svenjaKL";
        //WHEN
        boolean actual = Main.beidesBuchstaben(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void beidesBuchstaben_svenjakl() {
        //GIVEN
        String a = "svenjakl";
        //WHEN
        boolean actual = Main.beidesBuchstaben(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void beidesBuchstaben_SVENJAKL() {
        //GIVEN
        String a = "SVENJAKL";
        //WHEN
        boolean actual = Main.beidesBuchstaben(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void beidesBeides_svenjaKL1() {
        //GIVEN
        String a = "svenjaKL1";
        //WHEN
        boolean actual = Main.beidesBeides(a);
        //THEN
        assertTrue(actual);
    }
    @Test
    void beidesBeides_svenjakl1() {
        //GIVEN
        String a = "svenjakl1";
        //WHEN
        boolean actual = Main.beidesBeides(a);
        //THEN
        assertFalse(actual);
    }
    @Test
    void beidesBeides_svenjaKL() {
        //GIVEN
        String a = "svenjaKL";
        //WHEN
        boolean actual = Main.beidesBeides(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void schlechtesPasswort_Passwort1234() {
        //GIVEN
        String a = "Passwort1234";
        //WHEN
        boolean actual = Main.schlechtesPasswort(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void schlechtesPasswort_SvenjaKL123() {
        //GIVEN
        String a = "SvenjaKL123";
        //WHEN
        boolean actual = Main.schlechtesPasswort(a);
        //THEN
        assertFalse(actual);
    }

    @Test
    void allesPruefen_SvenjaKL123() {
        //GIVEN
        String a = "SvenjaKL123";
        //WHEN
        boolean actual = Main.allesPruefen(a);
        //THEN
        assertTrue(actual);
    }

    @Test
    void allesPruefen_Passwort123() {
        //GIVEN
        String a = "Passwort123";
        //WHEN
        boolean actual = Main.allesPruefen(a);
        //THEN
        assertFalse(actual);
    }

}