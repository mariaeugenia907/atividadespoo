public class TestaEquipamento {
public static v oid m ain(String[] args) {
Equipamento ar = new E quipamento();
Equipamento micro = n ew Equipamento();
ar .ligado =t rue ;
micro .ligado = false;
ar .investe();
micro .investe();
if ( ar. e staLigado ()== true) {
System.o ut. println(" ligada" );
} else {
System.o ut. println(" desligada") ;
}
if ( micro. estaLigado( )== true ) {
System.o ut. println(" ligado" );
} else {
System.o ut. println(" desligado") ;
}
}
}