package objetoReferencia;

public class ExemploObj {

	public static void modificarModelo(CarroObj carro) {
		
		carro.modelo = "Fusca";
		
	}
	
	public static void main(String[] args) {
	
		
		CarroObj meuCarro = new CarroObj ("Ferroviario");
		

		System.out.println("Antes: " + meuCarro.modelo);
		
		
		modificarModelo(meuCarro);
		
		System.out.println("Depois: " + meuCarro.modelo);
			
	}

}
