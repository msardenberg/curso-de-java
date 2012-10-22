//Fala mestre, fiz as primeiras três figuras com a Lara em aula e depois finalizei em casa. Creio que esse código possa ser refatorado, até segunda eu melhoro


public class Desafio{
	private String asteristicos=     "*********************";
	private String espacosEmBranco=  "                                  ";
	private String desenho;
	private String auxiliar;
	private int ponteiro1;
	private int ponteiro2;

	public void figura1(){
		for (int contador = 1; contador <= 10; contador++){
			desenho = asteristicos.substring(0,contador);
			System.out.println(desenho);
		}			
	}
	
	
	public void figura2(){
		for (int contador = 10; contador >= 1; contador--){
			desenho = asteristicos.substring(0,contador);
			System.out.println(desenho);
		}
	}

	public void figura3(){	
		for (int contador = 1; contador <=10; contador++){
			desenho = espacosEmBranco.substring(1,contador) + asteristicos.substring((contador),11);
			System.out.println(desenho);
		}
	}
	
	public void figura4(){	
		auxiliar = "*";
		for (int contador = 10; contador >=1; contador--){
			desenho = espacosEmBranco.substring(1,contador) + auxiliar;
			auxiliar = auxiliar + '*';
			System.out.println(desenho);
		}
	}
	
	public void figura5(){
		espacosEmBranco = "          *          ";
		System.out.println(espacosEmBranco);
		ponteiro1 =10;
		ponteiro2 =20;
		auxiliar = "*";
		for (int contador = 1; contador<=10; contador++){
			auxiliar = auxiliar + "**";
			desenho = espacosEmBranco.substring(1,ponteiro1--) + auxiliar;
			System.out.println(desenho);
		}
		desenho = "                     ";
		for (int contador = 1; contador<=9; contador++){
			desenho = espacosEmBranco.substring(1,(contador +1)) + asteristicos.substring(1,ponteiro2);
			ponteiro2 =--ponteiro2 - 1;
			System.out.println(desenho);
		}
		System.out.println("          *          ");
	}
	
	public static void main(String[] args){
		Desafio desafio = new Desafio();
		desafio.figura1();
		System.out.println();	
		desafio.figura2();
		System.out.println();	
		desafio.figura3();
		System.out.println();	
		desafio.figura4();
		System.out.println();	
		desafio.figura5();
		
	}
}
