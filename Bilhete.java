public class Bilhete {
    private String user;
    private String cpf;
    private String sala;
    private String sessao;
    private String nome_do_filme;
    private double valor;
    private String cadeira_comprada;
    
    public Bilhete(String user, String cpf, String sala, String sessao, String nome_do_filme, Double valor, String cadeira_comprada) {

        this.user = user;
        this.cpf = cpf;
        this.sala = sala;
        this.sessao = sessao;
        this.nome_do_filme = nome_do_filme;
        this.valor = valor;
        this.cadeira_comprada = cadeira_comprada;

    }
}
