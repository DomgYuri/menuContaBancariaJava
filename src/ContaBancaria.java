import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeDoCliente = "Yuri Silva Domingues";
        String tipoDeConta = "Corrente";
        double saldoEmConta = 2000.00;

        String mensagemInicial = """
                ********************************************
                        Dados do Cliente
                                
                Nome: %s
                Tipo de conta: %s
                Saldo : %.2f
                                
                ********************************************
                """.formatted(nomeDoCliente, tipoDeConta, saldoEmConta);

        System.out.println(mensagemInicial);

        int escolha = 0;

        while (escolha != 4) {
            String menu = """
                            Operações
                    1 - Ver o saldo da conta
                    2 - Realizar um deposito
                    3 - Realizar uma transferencia
                    4 - sair
                    """;
            System.out.println(menu);
            escolha = leitor.nextInt();
            System.out.println("");

            switch (escolha) {
                case 1:
                    System.out.println(saldoEmConta);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("valor a ser depositado");
                    double deposito = leitor.nextInt();
                    saldoEmConta += deposito;
                    System.out.println("""
                            Deposito realizado com sucesso!
                            novo saldo em conta %.2f
                            """.formatted(saldoEmConta));
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    double transferencia = leitor.nextInt();
                    if (transferencia <= saldoEmConta) {
                        saldoEmConta -= transferencia;
                        System.out.println("Transferencia realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para transação");
                    }
                    System.out.println("");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção invalida");
                    System.out.println("");
                    break;
            }


        }

    }
}