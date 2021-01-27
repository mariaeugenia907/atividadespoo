public class Senha {
String valor;
boolean iguais (String valor) {
	if(this.valor == valor) {
	return true;
	} else {
		return false;
	}
	}
boolean iguaisTrim(String valor) {
	return this.valor.trim().equals(valor.trim());
}

boolean tamanhoSeguro() {
	if (this.valor.length() >= 6) {
		return true;
	} else {
		return false;
	}
}
boolean achouNumero = false;
boolean possuiMaiuscula = false;
boolean possuiMinuscula = false;{

for (char c : valor.toCharArray()) {
     if (c >= '0' && c <= '9') {
         achouNumero = true;
     } else if (c >= 'A' && c <= 'Z') {
         possuiMaiuscula = true;
     } else if (c >= 'a' && c <= 'z') {
         possuiMinuscula = true;
     } 
          }
return achouNumero && possuiMaiuscula && possuiMinuscula;

}
boolean valida() {
	return tamanhoSeguro() && possuiMaiuscula() && possuiMinuscula() && achouNumero();
}

}