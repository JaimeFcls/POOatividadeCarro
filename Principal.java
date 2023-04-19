package aula04;

public class Principal {

	public static void main(String[] args) {
		Veiculo carrinho1=new Veiculo();
		
		carrinho1.numbWheels=4;
		carrinho1.brand="Fiat";
		carrinho1.model="Uno";
		carrinho1.numbDoors=4;
		carrinho1.speed=75;
		carrinho1.acerelar(10);
		
		/* 
		Para diminuir a velocidade do carro em 10km
		 */
		carrinho1.frear(10);
		
Veiculo carrinho2=new Veiculo();
		
		carrinho2.numbWheels=6;
		carrinho2.brand="Volkswagen";
		carrinho2.model="V8l";
		carrinho2.numbDoors=1;
		carrinho2.speed=50;
		carrinho2.acerelar(10);
		
		/* 
		Para diminuir a velocidade do carro em 10km
		 */
		carrinho1.frear(10);
		
		
		System.out.println(
				"Número de rodas = "+' '+carrinho1.numbWheels+
				"\nMarca = " +carrinho1.brand+
				"\nModelo = "+carrinho1.model+
				"\nNúmero de Portas = "+carrinho1.numbDoors+
				"\nVelocidade = "+' '+carrinho1.speed);
		
		
		System.out.println(
				"\nNúmero de rodas = "+' '+carrinho2.numbWheels+
				"\nMarca = " +carrinho2.brand+
				"\nModelo = "+carrinho2.model+
				"\nNúmero de Portas = "+carrinho2.numbDoors+
				"\nVelocidade = "+' '+carrinho2.speed);
		
	}

}
