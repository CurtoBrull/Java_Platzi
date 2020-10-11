import javax.sound.midi.Soundbank;

public class MathematicOperation {
  public static void main(String[] args) {
    double x = 2.1;
    double y = 3;
    double z = 2;

    System.out.println(Math.PI);
    System.out.println(Math.E);
    // Redondeamos hacia arriba
    System.out.println(Math.ceil(x));
    // Redondeamos hacia abajo
    System.out.println(Math.floor(x));
    // Numero elevado a otro
    System.out.println(Math.pow(z, y));
    // EL valor mayor
    System.out.println(Math.max(x, y));
    // Raiz cuadrada
    System.out.println(Math.sqrt(y));
    // Área circulo = pi * r2
    System.out.println(Math.PI * Math.pow(y,2));
    // Área esfera 4 * PI * r2
    System.out.println(4 * Math.PI * Math.pow(y,2));
    // Volumen esfera (4/3) * PI * r3
    System.out.println((4/3) * Math.PI * Math.pow(y, 3));
  }
}
