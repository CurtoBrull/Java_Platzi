package java_curso;

public class DataTypes {
    public static void main(String[] args) {
        // int 10 digitos
        int n = 1234567890;
        // Long L al final
        long nL = 1234567890123456789L;

        // Decimales
        double nD = 123.456;
        // Float decimales reducidos F al final
        float nF = 123.456F;

        // var para asignar variables a partir de Java 10

        int salary = 1000; // int
        // Pension 3% de salario
        double pension = salary * 0.03; // double
        double totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
        
        String employeeName = "Javier Curto";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
