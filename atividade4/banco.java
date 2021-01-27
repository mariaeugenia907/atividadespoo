import java.util.Scanner;

public class ExecutaBanco {
	private static Banco bb;
	private static Scanner s;
	public static void main(String[] args) {
		bb = new Banco();
		s = new Scanner(System.in);
		String opcao = "_____";
		String numero = "_______";
		do {
		try {
		System.out.println("\n\n1-Cadastrar 2-Excluir 3-Consultar 4-Creditar 5-transferir 6-render juros 7-debitar... 9-Sair");
		System.out.println("Escolha a opção:");
				opcao = s.next();
					switch (opcao) {
				case "1":
					inserir();
					break;
				case "2":
					excluir();
					break;
				case "3":
					consultar();
					break;
				case "4":
					creditar();
					break;
				case "5":
					transferir();
					break;
				case "6":
					renderJuros();
					break;
				case "7":
					debitar();
					break;
				}
			} catch (AplicacaoException e) {
				System.out.println("Erro:" + e.getMessage());
			} catch (Exception e) {
				System.out.println("Erro.");
			}
		} while (!opcao.equals("9"));
	}

	private static void renderJuros() {
		String numero;
		System.out.println("n da conta:");
		numero = s.next();
		bb.renderJuros(numero);
		System.out.println("Novo saldo:" + bb.consultar(numero).getSaldo());
	}

	private static void transferir() {
		String numeroCredito;
		System.out.println("n da conta de credito:");
		numeroCredito = s.next();

		String numeroDebito;
		System.out.println("n da conta de débito:");
		numeroDebito = s.next();

		System.out.println("valor da transferência:");
		double valor = s.nextDouble();
		
		bb.transferir(numeroCredito, numeroDebito, valor);
		System.out.println("Novo saldo creditado: " + bb.consultar(numeroCredito));
		System.out.println("Novo saldo debitado: " + bb.consultar(numeroDebito));
		}
	private static void creditar() {
		String numero;
		System.out.println("número:");
		numero = s.next();
		System.out.println("valor do crédito:");
		double valor = s.nextDouble();
		bb.creditar(numero, valor);
		System.out.println("Novo saldo: " + bb.consultar(numero).getSaldo());
	}
	private static void debitar() {
		String numero;
		System.out.println("número:");
		numero = sc.next();
		System.out.println("débito:");
		double valor = s.nextDouble();
		bb.debitar(numero, valor);
		System.out.println("Novo saldo: " + bb.consultar(numero).getSaldo());
	}
	private static void consultar() {
		String numero;
		Conta c;
		System.out.println("número:");
		numero = s.next();
		c = bb.consultar(numero);
		if (c != null) {
			System.out.println("Número: " + c.getNumero() + " - Saldo: " + c.getSaldo());
		} else {
			System.out.println("não encontrada.");
		}
	}

	private static void excluir() {
		String numero;
		System.out.println("número:");
		numero = s.next();
		bb.excluir(numero);
	}

	private static void inserir() {
		Conta c;
		System.out.println("número:");
		String numero = s.next();
		System.out.println(" qual o tipo da conta?: 1) Conta  2) Poupança  3) Conta Imposto");
		String tipo = s.next();
		System.out.println("saldo inicial:");
		double saldo = s.nextDouble();
		
		if (tipo.equals("1")) {
			c = new Conta(numero, saldo);
		} else if (tipo.equals("2")) {
			System.out.println("taxa de rendimento:");
			double taxa = s.nextDouble();
			c = new Poupanca(numero, saldo, taxa);
		} else if (tipo.equals("3")) {
			c = new ContaImposto(numero, saldo);
		}
		c = new Conta(numero, saldo);
		
		bb.inserir(c);
		System.out.println("Conta cadastrada");

	}
}
