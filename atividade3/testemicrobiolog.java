public class testemicrobiolog {
	public static void main(String[] args) {
		Postagem p1 = new Postagem();
		p1.id = 1;
		p1.texto = "ola";
		p1.curtir();
		
		Postagem p2 = new Postagem();
		p2.id = 2;
		p2.texto = "tudo bem";
		p2.curtir();
		p2.curtir();
		
		Microblog m = new Microblog(2);
		m.incluir(p1);
		m.incluir(p2);
		
		System.out.println(m.retornarMaisCurtida().texto);

	}

}