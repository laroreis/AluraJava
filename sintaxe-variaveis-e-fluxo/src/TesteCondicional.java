
public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}
		else { 
			if (quantidadePessoas>=2) {
				System.out.println("Voc� n�o � maior de idade, mas est� acompanhado");
			} else {
			System.out.println("� uma pena, mas voc� n�o pode entrar!");
			}
		}
	}
}
