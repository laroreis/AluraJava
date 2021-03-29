
public class TestaEscopo {

		public static void main(String[] args) {
			System.out.println("testando condicionais");
			
			int idade = 26;
			int quantidadePessoas = 3;
			
			//boolean acompanhado = quantidadePessoas >= 2;
			//System.out.println("quantidades de pessoas acompanhadas:" + quantidadePessoas );
			boolean acompanhado;
			if (quantidadePessoas >= 2) {
				acompanhado = true;
				
			}else {
				acompanhado = false;}
			System.out.println("Valor acompanhado igual: " + acompanhado);
		}
			}
		


