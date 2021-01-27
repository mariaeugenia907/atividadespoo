public class Teste {
	int b = 1;   
	int a; 
	 
    Teste(int a) {        
    	a = b + a; 
        System.out.print(this.a); 
    } 
 
    public static void main(String args[]) { 
        Teste t = new Teste(2); 
    } 
} 



A inicialização esta incorreta para compilar ficou ambiguo, então o resultado foi zero.