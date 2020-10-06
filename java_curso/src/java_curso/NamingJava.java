            // Upper Camel Case
public class NamingJava {
    public static void main(String[] args) {
        // Sensible a Mayúsculas
        int celphone = 11223344;
        int celPhone = 55667788;
        System.out.println(celphone);
        System.out.println(celPhone);

        // Inicio o contiene $
        String $countryName = "Spain";
        String currency$ = "€";

        // Inicio o contienen _
        String _backgroundColor = "Green";
        String background_color = "Yellow";

        // Constantes (final)
        final int POSITION = -5;
        final int MAX_WIDTH = 1000;

        // Lower Camel Case
        String fullName = "Javier Curto Brull";
        int sizeInCentimeters = 26;
    }
}
