public class conta {
private int numeroConta;
private String indice;
//representa o saldo atual dessa conta
protected double saldo;
//construtor
private void Conta(int numeroConta, String indice) {
this.numeroConta = numeroConta;
this.indice = indice;
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
public double getSaldo() {
return this.saldo;
}
public void gerarTaxa() {}
}
public class ContaPoupanca extends Conta {
private ContaPoupanca (int numeroConta, String indice) {
super(numeroConta, indice);
}
}
}
}