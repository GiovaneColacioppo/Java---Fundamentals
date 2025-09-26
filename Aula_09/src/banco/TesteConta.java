package banco;

import java.util.Scanner;

public class TesteConta {

    public static void main(String[] args) {

    	//instanciar a classe Scanner "ler"
    	
    	Scanner ler = new Scanner(System.in);
    	
        Scanner lerS = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = lerS.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        String cpf = lerS.nextLine();

        System.out.println("Digite o numero da agencia: ");
        int agencia = ler.nextInt();

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = ler.nextDouble();

        System.out.println("Digite a senha da conta: ");
        int senha = ler.nextInt();

   	
        
	//instanciar a classe Cliente "cliente1"

	//instanciar a classe Cliente "cliente2"

	
	//solicitar o saldo do cliente1

	//realizar saque do cliente1

	//realizar depósito do cliente1

	//realizar transferencia do cliente1 para o cliente2 .

	//ver saldo do cliente1

	//ver saldo do cliente2

        
        
        ler.close();
        lerS.close();

  
    }
}
