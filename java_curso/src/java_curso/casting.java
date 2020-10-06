public class casting {
  public static void main(String[] args) {

    // Hemos alojado 30 personas en 1 año
    // Cuántas personas por mes de promedio?
    double monthyPersons = 30.0 / 12.0;
    System.out.println(monthyPersons); // 2.5 al mes

    // Estimación
    // Convertir double a int colocar (int) delante de la variable
    int estimatedMonthlyPersons = (int) monthyPersons;
    System.out.println(estimatedMonthlyPersons);

    // Exactitud poner (double) delante Casting no automático
    int a = 30;
    int b = 12;
    System.out.println((double)a/b);

    // 2 enteros a Double. Cast automático.
    double c = a/b;
    System.out.println(c);

    char n =  '1';
    int nI = n; // Char es más pequeño que un entero
    System.out.println(nI); // 49 que es 1 en tabla ASCII

    // char es mas grande que short, se necesita casting
    short nS = (short) n;
    System.out.println(nS);
  }
}
