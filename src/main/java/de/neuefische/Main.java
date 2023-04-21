package de.neuefische;

/*
Überprüfe erst die Länge des Passworts und
dann, ob Zahlen enthalten sind
Checke, ob kleine/große Buchstaben enthalten sind
Verbiete "schlechte" Passwörter wie "passwort" oder "123456"
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(allesPruefen("SvenjaKl123"));
    }

    public static boolean laengePruefen(String a) {
        return a.length() >= 8;
    }

    public static boolean zahlPruefen(String b) {
        return b.matches(".*[0-9].*");

    }

    public static boolean beidesPruefen(String c) {
        return laengePruefen(c) && zahlPruefen(c);
    }

    public static boolean kleineBuchstaben(String d) {
        return d.matches(".*[a-z].*");
    }

    public static boolean grosseBuchstaben(String e) {
        return e.matches(".*[A-Z].*");
    }

    public static boolean beidesBuchstaben(String f) {
        return kleineBuchstaben(f) && grosseBuchstaben(f);
    }

    public static boolean beidesBeides(String g) {
        return beidesPruefen(g) && beidesBuchstaben(g);
    }

    public static boolean schlechtesPasswort(String h) {
        String [] passwortArray = {"Passwort12345","Passwort1234","Passwort123","Passwort12","Passwort1"};
        for (int i =0; i<passwortArray.length; i++){
            if (h.equals(passwortArray[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean allesPruefen(String j) {
        return beidesBeides(j) && !schlechtesPasswort(j);
    }
}