import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome de usuário:");
        String user = entrada.nextLine();

        System.out.println("Digite seu CPF:");
        String cpf = entrada.nextLine();

        System.out.println("Digite sua senha:");
        String senha = entrada.nextLine();

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
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
        System.out.printf("teste %s %s %s %d %s %s %s %s %s", usuario.getUser(), usuario.getCpf(), usuario.getSenha(), usuario.getIdade(), usuario.getSexo(), usuario.getEmail(), usuario.getNome_do_cartao(), usuario.getNumero_do_cartao(), usuario.getCodigo_verificador_do_cartao());
        entrada.close();

    }
}
