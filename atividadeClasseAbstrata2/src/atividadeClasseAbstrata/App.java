package atividadeClasseAbstrata;

public class App {

	public static void main(String[] args) {
		
		 Figura2D fig [] = new Figura2D[3];
		 fig[0] = new Circulo();
		 fig[1] = new Quadrado();
		 fig[2] = new Triangulo();
		 
		 for(int i=0; i < 3; i++) {
				System.out.println(fig[i].pegaTexto());
		 }
	}
}
