/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_curso;

/**
 *
 * @author niven
 */
public class Arrays {
    
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        
        // 2 dimensiones [fila][columna]
        String[][] cities = new String[4][2];
        
        // 3 dimensiones [filas][columna][página]
        int [][][] numbers = new int[2][2][2];
        int [][][][]numbers4 = new int[2][2][2][2];
        
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        // de 0 a N-1 o poner < xxx.length / Valor por defecto de un String es null
        for (int i = 0; i < androidVersions.length ; i++) {
            System.out.println(androidVersions[i]);
        }
        System.out.println();
        System.out.println();

        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }
        for (int i = 0; i <= 3 ; i++) {
            System.out.println(androidVersions[i]);
        }
        
        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3])*/;
        
        System.out.println("");
        System.out.println("");
        
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        // 2 Dimensiones 2 for
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
        System.out.println();
        System.out.println();

        for (String[] parejas : cities) {
            for (String name : parejas) {
                System.out.println(name);
            }
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/
        
        System.out.println("");
        System.out.println("");
        
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Chango";

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        
//        System.out.println(animals[1][0][0][1]);
        
        System.out.println("");
        System.out.println("");

        int x = 1; while (x <= 10) System.out.println(++x);
        String arreglo[] = new String[10];
        arreglo[0] = "hola";
        System.out.println(arreglo[0]);
        int i=1, j=2, k=3, m=2; System.out.println ((j >= i) || (k == m));
//        Foo f[] = new Foo[20];
        byte edad = 24;
        System.out.println(edad);
    }
    
}
