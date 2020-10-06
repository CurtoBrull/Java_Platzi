public class UpdatingVars {
  public static void main(String[] args) {
    
    int salary = 1000;
    
    // Bono de 200
    salary = salary + 200;
    System.out.println(salary);

    // Aporte pension 50 €
    salary = salary - 50;
    System.out.println(salary);

    // Hora extra 30€
    // 2 horas extra    
    // Comida 45€

    salary = salary + (30*2) - 45;
    System.out.println(salary);

    // Actualizar cadenas de texto

    String employeeName = "Javier Curto";
    employeeName = employeeName + " Brull";
    System.out.println(employeeName);

    employeeName = "Trabajador: " + employeeName;
  }
}