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
        
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        
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
        
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
        
        System.out.println("");
        System.out.println("");
        
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Chango";
        
        System.out.println(animals[1][0][0][1]);
        
        System.out.println("");
        System.out.println("");
    }
    
}