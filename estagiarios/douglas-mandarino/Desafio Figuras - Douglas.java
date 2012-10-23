public class Desenhos {

    public static void main(String[] args) {
        Desenhos desenhos = new Desenhos();

        desenhos.figura1();

        desenhos.figura2();

        desenhos.figura3();

        desenhos.figura4();

        desenhos.figura5();
    }

    public void figura1() {
        System.out.println("Figura 1: \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void figura2() {
        System.out.println("Figura 2: \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void figura3() {
        System.out.println("Figura 3: \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

    public void figura4() {
        System.out.println("Figura 4: \n");
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    public void figura5() {

        int meio = 11;
        System.out.println("Figura 5: \n");

        for (int i = 0; i < 11; i++) {
            for (int j = 11; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int direita = 0; direita < i; direita++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < 11; i++) {
            System.out.print(" ");
            for (int j = 0; j < 10; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int direita = 10; direita >= i; direita--) {
                System.out.print("*");
            }


            System.out.println("");
        }
    }
}
