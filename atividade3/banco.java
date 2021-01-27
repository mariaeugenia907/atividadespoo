public class banco {
Conta[] contas;
int indice = 0;
public void Banco() {
contas = new Conta[50];
}
public void Banco(int tamanho) {
contas = new Conta[tamanho];
}
void inserir(Conta c) {
if (indice < contas.length) {
contas[indice] = c;
indice++;
} else {
System.out.println("Número máximo de contas atingido");
}
}
}
Conta consultar(String numero) {
Conta c = null;
for (int i = 0; i < indice; i++) {
if (contas[i].numero.equals(numero)) {
c = contas[i];
break;
}
}
return c;
}
int consultarIndice(String numero) {
int pos = -1;
for (int i = 0; i < indice; i++) {
if (contas[i].numero.equals(numero)) {
pos = i;
break;
}
}
return pos;
}
void debitar(String numero, double valor) {
Conta c;
c = consultar(numero);
if (c != null){
c.sacar(valor);
}
else if (c != null)
{
c.depositar(valor);
}
Else {
System.out.println("Conta inexistente.");
}
void transferir(String numCredito, String numDebito, double valor) {
Conta contaCredito = consultar(numCredito);
Conta contaDebito = consultar(numDebito);
if (contaCredito != null && contaDebito != null) {
contaCredito.transferir(contaDebito, valor);
} else {
System.out.println("As duas contas devem existir.");
}
}
void alterar(Conta c) {
int indice = consultarIndice(c.numero);
if (indice != -1) {
contas[indice] = c;
}
}
void excluir(String numero) {
int posicao = consultarIndice(numero);
if (posicao != -1) {
for (int i = posicao; i < indice; i++) {
contas[i] = contas[i + 1];
}
indice--;
}
}
int retornaQuantidade() {
return indice;
}
double retornaValorTotal() {
double total = 0;
for (int i = 0; i < indice; i++) {
total += contas[i].saldo;
}
return total;
}
double retornaMediaValores() {
return retornaValorTotal()/retornaQuantidade();
}
}