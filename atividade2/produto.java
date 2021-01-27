public class Produto {
int codigo, qnt, qntmin=10;
double valor;
String desc;
Produto(int codigo, int qnt, double valor, String desc){
	this.codigo =  codigo;
	this.desc = desc;
	this.valor = valor;
	this.qnt = qnt;
}
boolean baixa(int qnt) {
if (this.qnt - qnt < qntmin) {
	return false;
} else {
	this.qnt-=qnt;
	return true;
}
}
void reposicao(int qnt) {
	this.qnt+=qnt;
}
void reajustar(double t) {
	this.valor = this.valor + (this.valor/100)*t;
}
public String() {
	return " " +this.codigo + "  " +this.desc+ " "+ this.qnt+ " "+this.valor;
}
}
