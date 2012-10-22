public class Exercicio3 {

  public static void main(String[] args) {

    int a = 10;        

    int b = a++; // Dica: acontece depois da soma  //a==11 ; b==10

    int c = ++b; // Dica: acontece antes da soma // c==10+1==11 ; b==11;

    System.out.println(a + b + c); // 11+11+11

  }

}

