public class Equipamento {
boolean l igado = false;
public boolean liga() {
return ligado =t rue ;
}
public boolean desliga() {
return ligado =f alse;
}
public boolean investe() {
if ( ligado= = true ) {
return l igado =f alse ;
} else {
return l igado =t rue ;
}
}
boolean e staLigado() {
return ligado ;
}
}