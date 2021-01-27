public class Jogador {
	int f, n, pontosAtuais;

    Jogador(int forca, int nivel, int pontosAtuais){
        this.f = forca;
        this.n = nivel;
        this.pontosAtuais = pontosAtuais;
    }
    int pontosAtaque(int forca, int nivel) {
        return 
        		forca * nivel;
    }

    void atacar(Jogador novoJogador){
        novoJogador.pontosAtuais -= this.pontosAtaque(f, n);
    }
}