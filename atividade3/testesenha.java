public class testesenha3 {

	public static void main(String[] args) {
		Senha senha = new Senha();
		senha.valor = "777xyz";
		System.out.println("sao iguais?" + senha.iguais("777xyz"));
		System.out.println("sao iguais?" + senha.iguais("222xyz"));
		
		System.out.println("sao iguais tirando os espaços?" + senha.iguaisTrim("  777xyz  "));
		
		System.out.println("o tamanho eh seguro?" + senha.tamanhoSeguro());
		
		senha.valor = "Xyz777";
		System.out.println("possui maiuscula?" + senha.possuiMaiuscula());
		System.out.println("possui minuscula?" + senha.possuiMinuscula());
		System.out.println("possui numero?" + senha.achouNumero());
	}
}