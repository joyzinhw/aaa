import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class App {

 static Scanner Entrada = new Scanner(System.in);

  static ArrayList<Conta> c;
  public static void main(String[] args){

        c = new  ArrayList<>();
        menu();
        }
        
        /**
         * 
         */
        private static void menu() {
        
        System.out.println("------------------------------------------------------");
        System.out.println("-------------Bem-vindo(a) a nossa Agência virtual-------------");
        System.out.println("***** Escolha uma funcionalidade ***** \n");
        System.out.println("1.Criar Conta ");
        System.out.println("2.Saldo ");
        System.out.println("3.Deposito ");
        System.out.println("4.Saque ");
        System.out.println("5.Transferencia");
        System.out.println("6.Lista ");
        System.out.println("7.Sair \n");

        System.out.println("Operação escolhida!\n");
       
        int menu = Entrada.nextInt();

        switch (menu){
        case 1:
        CriarConta();
        break;

        case 2:
        Saldo();
        break;

        case 3:
        Depositar();       
        break;

        case 4:
        Sacar();
        break;

        case 5:
        Transferencia();
        break;

        case 6:
        ListarContas();
        break;

        case 7:
        System.out.println("Operação Finalizada!");
        System.exit(0); // para o sistema

        default:
            System.out.println("Opção inválida!");
            menu();
            break;
       
    } 
           
    }


     /**
     * @param valor
     */
    private static Conta EncontrarConta(int Numero){
      Conta conta = null;
      if (c.size() > 0 ){
        for (Conta ct : c){
         if (ct.getNumerodaconta() == Numero){
          conta = ct ;
         }
        }
      }
      
      return conta;

    }
    private static void Saldo(){
      System.out.println("Digite o numero da conta");
      int numero = Entrada.nextInt(); 
      Conta conta = encontrarConta(numero);

      if (conta != null){
        System.out.println(conta.getSaldo());
      }

      menu();
    } 

    private static void Depositar(double valor){
       System.out.println("");
       System.out.println("-- Realizar Deposito --");
       System.out.println("Numero da Conta:" );
       int numero = Entrada.nextInt();

       Conta conta = encontrarConta(numero);
       
     
        if(conta != null) {
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();

            conta.depositar(valorDeposito);
        }
        else {
            System.out.println("Conta não encontrada!");
        }

        menu();

    }
     
     /**
     * @param valor
     */
    private static void Sacar(double valor){
      
       System.out.println("");
       System..println("-- Realizar Saque --");out
       System.out.println("Numero da Conta:" );
       int numero = Entrada.nextInt();

       Conta conta = encontrarConta(numero);


       if(conta != null) {
         System.out.println("Qual valor deseja sacar? ");
            Double valorSaque = input.nextDouble();

            conta.sacar(valorSaque);
            System.out.println("Saque realizado!");
        }
        else {
            System.out.println("Conta não encontrada!");
        }

        menu();

    }

     //public static void Transferir() {
       // System.out.println("Número da conta que vai enviar a transferência: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if(contaRemetente != null) {
            System.out.println("Número da conta do destinatário: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if(contaDestinatario != null) {
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferencia(contaDestinatario, valor);

            }
            else {
                System.out.println("--- A conta para depósito não foi encontrada ---");
            }

        }
        else {
            System.out.println("--- Conta para transferência não encontrada ---");
        }
        menu();
    }//
    /**
     * 
     */
    private static void CriarConta(){
      System.out.println("Informe o nome do usuario:");
      String nome = Entrada.next();

      System.out.println( "Informe o cpf:");
      String cpf = Entrada.next();

      System.out.println( "Informe a cidade:");
      String cidade = Entrada.next();

      System.out.println( "Informe o logradouro:");
      String logradouro = Entrada.next();

      System.out.println( "Informe numero da casa:");
      String numerodacasa = Entrada.next();

      System.out.println( "Informe o uf:");
      String uf = Entrada.next();

      System.out.println( "Informe a data de nascimento:");
      String dataString = Entrada.next();
      String [] dataSeparada = dataString.split("/");
      LocalDate datadenas = LocalDate.of(Integer.parseInt(dataSeparada[2]),Integer.parseInt(dataSeparada[1]),Integer.parseInt(dataSeparada[0]));

      Endereco endereco = new Endereco(cidade, logradouro, uf, numerodacasa);
      Cliente cliente = new Cliente(nome, cpf, datadenas, endereco);
      Conta conta = new Conta(cliente);
      c.add(conta);
      menu();
    }

    public static void ListarContas() {
        if(c.size() > 0) {
            for(Conta ct : c) {
                System.out.println(conta);
            }
        }
        else {
            System.out.println("Não há contas cadastradas!");
        }

        menu();
    }

}

