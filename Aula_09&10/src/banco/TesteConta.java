package banco;

import java.util.Scanner;

public class TesteConta {

    public static void main(String[] args) {

    	Cliente cl1 = new Cliente ("Joel", "123", "1195");
	   	
    	Cliente cl2 = new Cliente ("Mabel", "221", "1103");
    	
    	Conta ct1 = new Conta (cl1, 1000, 123,10 );
    	
    	Conta ct2 = new Conta(cl2, 2000, 111, 20);
    			
    	ct1.transferencia(123, 300.50, ct2);
    	
    	ct2.dadosCliente(111);
    	
    	System.out.println(cl1.getCliente());
    	
    	//instanciar a classe Scanner "ler"
    	

   	
        
	//instanciar a classe Cliente "cliente1"

	//instanciar a classe Cliente "cliente2"

	
	//solicitar o saldo do cliente1

	//realizar saque do cliente1

	//realizar depósito do cliente1

	//realizar transferencia do cliente1 para o cliente2 .

	//ver saldo do cliente1

	//ver saldo do cliente2

        

  
    }
}
