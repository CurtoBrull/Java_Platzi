public class ejercicios {
    public static void main(String[] args) {
        // Ejercicio 1.
        // Ponte creativo y preséntanos a tu familia con variables, utiliza todos los tipos y cantidad de variables
        // que puedas, no olvides las convenciones de nombres Camel Case.
        String yo = "Javier Curto Brull";
        String esposa = "Maria Dolores Adamuz Guil";
        String hijo = "Izhan Curto Adamuz";
        String hija = "Iris Curto Adamuz";
        int edadYo = 41;
        int edadEsposa = 47;
        int numeroHijos = 2;
        int edadHijo = 12;
        int edadHija = 9;
        boolean casados = true;
        System.out.println("Mi nombre es " + yo + " y estoy casado con " + esposa + ". "
        + "Tenemos " + numeroHijos + " hijos.");
        System.out.println("Yo tengo " + edadYo + " años y ella " + edadEsposa + " años.");
        System.out.println("Mis hijos son " + hijo + " de " + edadHijo + " años y " + hija + " de " + edadHija + " " +
                "años.");

        // Ejercicio 2
        //
        // Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos
        // indicando qué tipo es y si se está calculando estimación o exactitud.
        //
        // char c = ‘z’; conviertelo a int
        // int i = 250; conviertelo a long y luego de long a short
        // double d = 301.067; conviertelo a long
        // int i = 100; súmale 5000.66 y conviertelo a float
        // int i = 737; multiplícalo por 100 y conviertelo a byte
        // double d = 298.638; divídelo entre 25 y conviertelo a long
        char c = 'z';
        int cI = c;
        System.out.println(cI);

        int i = 250;
        long iL = i;
        short iS = (short) iL;
        System.out.println(iL);
        System.out.println(iS);

        double d = 301.067;
        long dL = (long) d;
        System.out.println(dL);

        int iSuma = 100;
        double iDouble = iSuma + 5000.66;
        float iFloat = (float) iDouble;
        System.out.println(iFloat);

        int i3 = 737;
        i3 *= 100;
        System.out.println(i3);
        byte i3b = (byte) i3;
        System.out.println(i3b);

        double d2 = 298.638;
        d2 /= 25;
        System.out.println(d2);
        long d3 = (long) d2;
        System.out.println(d3);
    }
}
