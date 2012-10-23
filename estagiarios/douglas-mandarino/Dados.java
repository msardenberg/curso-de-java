import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {

        int[] dado = {0, 0, 0, 0, 0, 0};

        System.out.println("Quantas vezes jogará o dado?");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int face = (int) (Math.random() * 6);
            dado[face] += 1;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + " foi sorteada: " + dado[i] + " vezes.");
        }
    }
}
