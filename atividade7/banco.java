public class banco {
	

	import AplicacaoException.AplicacaoException;

	public class Banco {
			
			private Conta[] contas;
			private int ind = 0;

			public Banco() {
				contas = new Conta[50];
			}
			public Banco(int tamanho) {
				contas = new Conta[tamanho];
			}
			public void inserir(Conta c) {
				if (ind < contas.length) { 
					contas[ind] = c;
					ind++;
				} else {
					System.out.println("máximo atingido");
				}
			}
			public Conta consultar(String numero) {
				Conta c = null;
				for (int i = 0; i < ind; i++) {
					if (contas[i].getNumero().equals(numero)) {
						c = contas[i];
						break;
					}
				}
				return c;
			}

			private int consultarIndice(Object object) {
				int pos = -1;
				int ind;
				for (int i = 0; i < ind; i++) {
					if (contas[i].getNumero().equals(object)) {
						pos = i;
						break;
					}
				}
				return pos;
			}

			public void debitar(String numero, double valor) {
				Conta c;
				c = consultar(numero);
				if (c == null) {
					throw new AplicacaoException("inexiste.");
				}
				
				c.sacar(valor);
			}

			public void creditar(String numero, double valor) {
				Conta c;
				c = consultar(numero);
				if (c != null)
					c.depositar(valor);
				else
					System.out.println("inexiste.");
			}
			
			public void transferir(String numCredito, String numDebito, double valor) {
				Conta contaCredito = consultar(numCredito);
				Conta contaDebito = consultar(numDebito);
				
				if (contaCredito != null && contaDebito != null) {
					contaCredito.transferir(contaDebito, valor);
				} else {
					System.out.println("As contas existem.");
				}
			}

			public void alterar(Conta c) {
				int indice = consultarIndice(c.getNumero());
				if (indice != -1) {
					contas[indice] = c;
				}

			}

			public void excluir(String numero) {
				int posicao = consultarIndice(numero);
				if (posicao != -1) {
					int ind;
					for (int i = posicao; i < ind; i++) {
						contas[i] = contas[i + 1];
					}

					ind--;
				}
			}
			
			public void renderJuros(String numero) {
				Conta c = consultar(numero);
				if (c instanceof Poupanca) {
					((Poupanca) c).renderJuros();
				} else {
					System.out.println("não encontrada");
				}
			}
			
			public int retornaQuantidade() {
				return ind;
			}
			
			public double retornaValorTotal() {
				double total = 0;
				for (int i = 0; i < ind; i++) {
					total += contas[i].getSaldo();
				}
				
				return total;
			}
			
			public double retornaMediaValores() {
				return retornaValorTotal()/retornaQuantidade();
			}
		}
	