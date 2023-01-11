public class App {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Tabela de multiplicação do " + num);
        for (int x = 0; x <= 10; x++) {
         System.out.print("Tabuada do: ");
         System.out.print(x + " x " + num + " = ");
         System.out.println(x * num);
        }
    }
}
