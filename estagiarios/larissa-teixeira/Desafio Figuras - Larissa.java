
public class Figuras {

    public static void main(String[] args) {
		System.out.println("--Desafio das Figuras--");
        Figuras triangulo = new Figuras();
		System.out.println("\nFigura 1:");
        triangulo.triangulo1();
		System.out.println("\nFigura 2:");
        triangulo.triangulo2();
		System.out.println("\nFigura 3:");
        triangulo.triangulo3();
		System.out.println("\nFigura 4:");
        triangulo.triangulo4();
		System.out.println("\nLosango:");
        triangulo.losango();

    }

    public void triangulo1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void triangulo2() {
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void triangulo3() {
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void triangulo4() {
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void losango() {
        int qtd = 0;
		//Parte de cima
        while (qtd < 21/2) {
            for (int j = 0; j < 21; j++) {
                if (j >= ((21 / 2) - qtd) && j <= ((21 / 2) + qtd)) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            qtd++;
            System.out.println("");
        }
		//Parte de baixo
        while (qtd >= 0) {
            for (int j = 0; j < 21; j++) {
                if (j >= ((21 / 2) - qtd) && j <= ((21 / 2) + qtd)) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            qtd--;
            System.out.println("");
        }
    }
}
