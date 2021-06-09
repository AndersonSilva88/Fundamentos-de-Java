package ClasseEobjetos;

public class Pessoa {
	
	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}
	
	void dar(int numfigurinhas, Pessoa p) {
		this.numFigurinhas -= numFigurinhas;
		//p.numFigurinhas += numFigurinhas;
		
		p.receber(numfigurinhas);
	}

}
