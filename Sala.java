public class Sala {
    private Sessao[] sessoes = new Sessao[7];

    public Sala(Sessao[] sessoes){
        this.sessoes = sessoes;
    }

    public Sessao[] getSessoes() {
        return sessoes;
    }

    public void setSessoes(Sessao[] sessoes) {
        this.sessoes = sessoes;
    }
}
