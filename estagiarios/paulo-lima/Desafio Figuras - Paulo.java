package ideais;
public class Triangulos {

    public static void main(String[] args) {
        Triangulos triangulo = new Triangulos();
        System.out.println(triangulo.figura1());
        System.out.print(triangulo.figura2());
        System.out.print(triangulo.figura3());
        System.out.print(triangulo.figura4());
        System.out.println(triangulo.figura5());

    }
    public String figura1(){
        String resp="";
        for (int linha=0; linha<10;linha++) {
            for (int coluna=0; coluna <10; coluna++){
                if(linha>=coluna){
                    resp+="*";
                }else{
                    resp+=" ";
                }
            }
            resp+="\n";
        }
        return resp;
    }
    public String figura2(){
        String resp="";
        for (int linha=0; linha<10;linha++) {
            for (int coluna=0; coluna <10; coluna++){
                if(linha+coluna<=9)
                    resp+="*";
                else
                    resp+=" ";
            }
            resp+="\n";
        }
        return resp;
    }
    public String figura3(){
        String resp="";
        for (int linha=0; linha<10;linha++) {
            for (int coluna=0; coluna <10; coluna++){
                if(linha<=coluna){
                    resp+="*";
                }else{
                    resp+=" ";
                }
            }
            resp+="\n";
        }
        return resp;
    }
    public String figura4(){
        String resp="";
        for (int linha=0; linha<=10;linha++) {
            for (int coluna=0; coluna <10; coluna++){
                if(linha+coluna>=10)
                    resp+="*";
                else
                    resp+=" ";
            }
            resp+="\n";
        }
        return resp;
    }
    public String figura5(){
		String resp="";
		for (int linha=0; linha<21;linha++) {
		   for (int coluna=0; coluna <20; coluna++){
		        if(linha+coluna>=20 &&linha<=coluna){
		            resp+="*";
		        }else{
		            resp+=" ";
		        }
		    }
            for (int coluna=0; coluna <20; coluna++){
		        if(linha+coluna<=20 && linha>=coluna){
		            resp+="*";
		        }else{
		            resp+=" ";
		        }
		    }
		    resp+="\n";
		}
		return resp;
	}
}
