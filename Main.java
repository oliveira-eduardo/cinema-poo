import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Cadastro();

    }

    public static void Cadastro(){
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
}
