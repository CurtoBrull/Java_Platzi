package java_curso;

public class IfStatement {
    public static void main(String[] args) {
        boolean isBlueToothEnabled = true;
        int fileSended = 3;
        
        if (isBlueToothEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");            
        }
        
        System.out.println(isBlueToothEnabled);
        System.out.println(fileSended);
    }
}
