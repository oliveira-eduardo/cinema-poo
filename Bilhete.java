public class Bilhete {
    private Filme nome_do_filme;
    private double valor;
    private String cadeira_comprada;
    
    public Bilhete(Filme nome_do_filme, double valor, String cadeira_comprada) {
        this.nome_do_filme = nome_do_filme.getNome();
        this.valor = valor;
        this.cadeira_comprada = cadeira_comprada;
    }
}
