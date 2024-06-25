import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        //criando um objeto da classe Scanner 
        Scanner sc = new Scanner(System.in);

        //Recebendo os dados do Scanner
        System.out.println("Digite o nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite a sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número: ");
        String numero = sc.nextLine();

        System.out.println("Digite o Saldo: ");
        float saldo= sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + ", já está disponível para saque.");
    }
}
