public class Sessao {
    private int[][] cadeira = new int[10][15];
    private String horario;
    private Filme filme;

    public Sessao(Filme filme, String horario) {
        this.filme = filme;
        this.horario = horario;
    }

    public int[][] getCadeira() {
        return cadeira;
    }

    public void setCadeira(int[][] cadeira) {
        this.cadeira = cadeira;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    
}  
    