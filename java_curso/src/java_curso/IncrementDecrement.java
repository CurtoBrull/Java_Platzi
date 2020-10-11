public class IncrementDecrement {
    public static void main(String[] args) {
        // vidas de Mario
        int lives = 5;
        lives = lives -1; // lives ahora vale 4
        System.out.println(lives); // 4

        // Postfija (detras de la variable)
        lives--;
        System.out.println(lives); // 3

        lives++;
        System.out.println(lives); // 4

        // Prefija (antes de la variable)
        // Gana regalo por ganar una vida
        int gift = 100 + lives++; // 104 postfijo
        System.out.println(gift); // 100 + 4 ya que se para antes de ++
        System.out.println(lives); // 5
        int gift2 = 100 + ++lives; // 106 prefijo
        System.out.println(gift2); // 100 + (1+5)
    }
}
