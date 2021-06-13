package Heranca;

public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		v.setMarca("GM");
		v.setModelo("Astra Hatch");
		v.setAno(2011);
		
		v.imprimirDados();
		v.buzinar();
		
		//usando herança
		System.out.println("--Usando Herança--");
		System.out.println("Carro");
		Carro c = new Carro();
		c.setMarca("Chevrolet");
		c.setModelo("Cruze");
		c.setAno(2021);
		c.setQuatroPortas(true);
		c.imprimirDados();
		c.buzinar();
		
		System.out.println();
		
		System.out.println("Motocicleta");
		Motocicleta m = new Motocicleta();
		m.setMarca("Honda");
		m.setModelo("Shadown");
		m.setAno(2015);
		m.imprimirDados();
		m.buzinar();
		m.empinar();
		
		System.out.println();
		
		Caminhao cam = new Caminhao();
		cam.buzinar();
		
		
			

	}

}
