public class Bilhete {
    private String nome; 
    private String cpf;
    private String filme;
    private String horario; 
    private String sessao;
    private String sala; 
    private float  valor;
    private String cadeiraComprada; 

    public Bilhete(Usuario usuario,Filme filme, Sessao sessao, Sala sala, Compra compra){
        this.nome = usuario.getUser();
        this.cpf = usuario.getCpf();
        this.sessao = sessao; //não sei os nomes dos atributos que vão ser na sessão, sala e compra
        this.valor = compra.getValor();
        this.cadeiraComprada = compra.getCadeira();

    }
}

