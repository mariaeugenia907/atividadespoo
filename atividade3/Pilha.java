public void empilhar(Object valor) {
// push
if (this. posicaoPilha < this.pilha.length - 1) {
// verifica se a posicaoPilha é menor do que o tamanho da pilha,
//se for, então é inserido o valor na pilha e ao mesmo tempo é feito
//o incremento do atributo posicaoPilha
this.pilha[++posicaoPilha] = valor;
}
}
public boolean estaCheia(){
if(this.posicao == this.tamanho){
JOptionPane.showMessageDialog(null,"Pilha cheia","Pilha",JOptionPane.INFORMATION_MESSAGE);
return true;
}//fim do if
else
return false;
public Object desempilhar() {
//pop
if (pilhaVazia()) {
return null;
// primeiro verificamos se a pilha esta vazia,
//se estiver, nada será realizado
}
return this.pilha[this. posicaoPilha --];
// aqui retorna o que tem na última posição da pilha
//e decrementa o atributo posicaoPilha
}
public String Elemento_Topo(){ 
return this.conteudo[this.posicao];
}
public void Mostra_Pilha(){ 
System.out.println(this.conteudo); 
}