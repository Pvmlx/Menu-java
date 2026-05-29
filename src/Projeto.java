import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando a variáveis
        String nome = "Elon Musk";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opcao = 0;

        //Criando o Menu :)
        System.out.println("--------Menu--------");
        System.out.println("\nDados Iniciais do Cliente: ");
        System.out.println("\nNome:             " + nome);
        System.out.println("Tipo da conta:    " + tipoConta);
        System.out.println("Saldo Disponivel: " + saldo + "R$");
        System.out.println("\n--------------------");
        //Agora fazer o menu de opções
        String menu = """
                **Digite sua opção:**
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Recarregar
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                double transferencia = scanner.nextDouble();
                if (saldo - transferencia < 0) {
                    System.out.println("Seu saldo é insuficiente para está transferencia");
                } else {
                    saldo -= transferencia;
                    System.out.println("Transferencia efetuada seu saldo agora é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Insira o valor que deseja recarregar: ");
                double recarga = scanner.nextDouble();
                if(recarga < 0){
                    System.out.println("Você não pode recarregar um valor negativo");
                }else{
                    saldo += recarga;
                    System.out.println("Recarga efetuada seu saldo agora é: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Encerrando Sistema");
            }else{
                System.out.println("Opção Inválida");
            }
        }
    }
}