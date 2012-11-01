package Fundamentos.parte4;
import java.util.TreeSet;

class ColecoesEx1 {


  public static void main(String[] args) {
     
	  TreeSet<Integer> numeros = new TreeSet<Integer>(); 
	  
	  	for (int i = 1; i <= 1000; i++) {
			numeros.add(i);			
		}
	  	System.out.println(numeros.descendingSet());
  }
}