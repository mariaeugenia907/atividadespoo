public class conta {
public class Conta {
private int numeroConta;
private String titular;
//representa o saldo atual dessa conta
protected double saldo;
//construtor
public Conta(int numeroConta, String titular) {
this.numeroConta = numeroConta;
this.titular = titular;
}
//saca o valor da conta e retorna true se operação bem sucedido
public boolean sacar(double valor) {
if (valor < saldo) {
this.saldo -= valor;
return true;
}
else {
return false;
}
}
//deposita o valor na conta e retorna true se operação bem sucedido
public boolean depositar(double valor) {
this.saldo += valor;
return true;
}
//recebe como parâmetro a contaDestino, a qual sofrerá um crédito do valor.
//ao mesmo tempo, esse mesmo valor deverá ser debitado da conta origem
public boolean transferir(Conta contaDestino, double valor){
boolean retirou = sacar(valor);
if (retirou) {
contaDestino.depositar(valor);
return true;
}
else {
return false;
}
}
//retorna o saldo da conta
public double getSaldo() {
return this.saldo;
}
public void gerarTaxa() {}
}
public double getSaldo() {
return this.saldo;
}
public void gerarTaxa() {}
}
public class ContaPoupanca extends Conta {
public ContaPoupanca (int numeroConta, String titular) {
super(numeroConta, titular);
}
public void gerarTaxa() {
saldo += saldo * 0.38;
}
}
