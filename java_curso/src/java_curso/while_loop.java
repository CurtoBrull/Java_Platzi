package src;

public class while_loop {

    // creamos variable booleana incializada en false
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        // Llamamos a la funcion
        turnOnOffLight();
        // Declaramos la variable iterable
        int i = 1;

        // Mientras la variable sea true y "i" 10 o menos
        while (isTurnOnLight && i <= 10){
            printSOS();
            i++;
        }
    }
    // Creamos la funcion que imprime la señal SOS
    public static void printSOS()  {
        System.out.println("...___...");
    }

    // Creamos la funcion de encender apagar luz
    public static boolean turnOnOffLight() {
        // Si la variable 
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
