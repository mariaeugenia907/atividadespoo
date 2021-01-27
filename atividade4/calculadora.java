public class calculadora {
public class CalculadoraExecucao {
private Double n1;
private Double n2;
private char operador;
 Método para somar
public void soma() {
System.out.println(this.n1 + this.n2);
}
 Método para diminuir
public void diminui() {
System.out.println(this.n1 - this.n2);
}
public CalculadoraExecucao(Double n1, Double n2, char operador) {
this.n1 = n1;
this.n2 = n2;
this.operador = operador;
 Verifica o operador
if (operador == '+') {
 Soma
this.soma();
} else if (operador == '-') {
 Diminui
this.diminui();
} else if (operador == '') {
}
public Double getN1() {
return n1;
}
public void setN1(Double n1) {
this.n1 = n1;
}
public Double getN2() {
return n2;
}
public void setN2(Double n2) {
this.n2 = n2;
}
public char getOperador() {
return operador;
}
public void setOperador(char operador) {
this.operador = operador;
}
public void main (String[] args) {
CalculadoraExecucao calc = new CalculadoraExecucao(1.0, 0.0, '/');
}
}
}