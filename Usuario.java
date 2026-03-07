import java.util.Scanner;

public class Usuario {
    private String user;
    private String cpf;
    private String senha;
    private int idade;
    private String sexo;
    private String email;
    private String nome_do_cartao;
    private String numero_do_cartao;
    private String codigo_verificador_do_cartao;

    public Usuario(String user, String cpf, String senha, int idade, String sexo, String email, String nome_do_cartao, String numero_do_cartao, String codigo_verificador_do_cartao) {
        this.user = user;
        this.cpf = cpf;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.nome_do_cartao = nome_do_cartao;
        this.numero_do_cartao = numero_do_cartao;
        this.codigo_verificador_do_cartao = codigo_verificador_do_cartao;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome_do_cartao(String nome_do_cartao) {
        this.nome_do_cartao = nome_do_cartao;
    }

    public void setNumero_do_cartao(String numero_do_cartao) {
        this.numero_do_cartao = numero_do_cartao;
    }

    public void setCodigo_verificador_do_cartao(String codigo_verificador_do_cartao) {
        this.codigo_verificador_do_cartao = codigo_verificador_do_cartao;
    }

    public String getUser() {
        return user;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getNome_do_cartao() {
        return nome_do_cartao;
    }

    public String getNumero_do_cartao() {
        return numero_do_cartao;
    }

    public String getCodigo_verificador_do_cartao() {
        return codigo_verificador_do_cartao;
    }

    public static Usuario Cadastro(){
        String user;
        String cpf;
        int idade;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Digite seu nome de usuário:");
            user = entrada.nextLine();

        }while(!isOnlyLetter(user));
        do { 
            System.out.println("Digite seu os 11 digitos do seu CPF:");
            cpf = entrada.nextLine();            
        } while (!verificarCpf(cpf));

        System.out.println("Digite sua senha:");
        String senha = entrada.nextLine();

        do { 
            System.out.println("Digite sua idade:");
            idade = entrada.nextInt();            
        } while (!verificadorIdade(idade));


        entrada.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite seu sexo:");
        String sexo = entrada.nextLine();

        System.out.println("Digite seu email:");
        String email = entrada.nextLine();

        System.out.println("Digite o nome do cartão:");
        String nome_do_cartao = entrada.nextLine();

        System.out.println("Digite o número do cartão:");
        String numero_do_cartao = entrada.nextLine();

        System.out.println("Digite o código verificador do cartão:");
        String codigo_verificador_do_cartao = entrada.nextLine();
        
        Usuario usuario = new Usuario(user, cpf, senha, idade, sexo, email, nome_do_cartao, numero_do_cartao, codigo_verificador_do_cartao);
        System.out.println(usuario);
        entrada.close();

        return usuario;
    }

    public static boolean isOnlyLetter(String nome){ 
        boolean r = nome.matches("[\\p{L}\\s]+");
        return r;
    }
    public static boolean verificarCpf(String cpf){
        boolean c = cpf.trim().matches("\\d{11}");
        return c;
    }
    public static boolean verificadorIdade(int idade){
        return idade >= 1 && idade <= 130;
    }
 
    @Override
    public String toString(){
        return "nome: " + getUser() + " cpf: " + getCpf() + " senha: " + getSenha() + " idade: " + getIdade()
        + " sexo: " + getSexo() + " email: " + getEmail() + " nome no cartão: " + getNome_do_cartao() + " numero no cartao: " + getNumero_do_cartao()
        + " codigo do cartao: " + getCodigo_verificador_do_cartao();
    }
}