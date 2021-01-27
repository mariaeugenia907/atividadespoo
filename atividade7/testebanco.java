public class TestaBanco {
		public static void main(String[] args) {
			Conta c = new Conta("1",200);
			Poupanca p = new Poupanca("2", 500, 1);
			
			p.saca(80);
			System.out.println(p.getSaldo());
			p.renderJuros();
			System.out.println(p.getSaldo());
			c.getSaldo() = 100 / p.getSaldo() = 170,10
			p.transferir(c, 1.5);
			System.out.println(c.getSaldo());
			System.out.println(p.getSaldo());
			
			c.transferir(p, c.getSaldo());
			System.out.println(c.getSaldo());
			System.out.println(p.getSaldo());
			
			
			Banco b = new Banco(5);
			b.inserir(c);
			b.inserir(p);
			
			b.consultar("2");
			System.out.println(p.getSaldo());
			
			b.transferir("1", "2", b.consultar("1").getSaldo());
			System.out.println(b.consultar("1").getSaldo());
			System.out.println(b.consultar("2").getSaldo());
			
			
			Conta poupanca = new Poupanca("5", 200, 80);
			((Poupanca) poupanca).renderJuros();
			b.inserir(poupanca);
			b.renderJuros("6");
			System.out.println(b.consultar("6").getSaldo());
			

			ContaImposto ci = new ContaImposto();
			ci.sacar(100);
			System.out.println(ci.getSaldo());
		}
	}