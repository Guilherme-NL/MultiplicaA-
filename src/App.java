public class App {
    public static void main(String[] args) {
        int num = 5;
        System.out.print("Tabela de multiplicação do " + num + "\n");
        for (int x = 0; x <= 10; x++) {
         System.out.print("Tabuada do: ");
         System.out.print(x + " x " + num + " = ");
         System.out.println(x * num);
        }
    }
}
