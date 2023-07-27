
public class Programa {

	public static void main(String[] args) {
		
		System.out.println("### PESSOA FISICA ###");
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Rui");
		pf.setIdade(44);
		pf.setCpf("772.053.000-45");
		pf.imprimirDados();
		
		System.out.println("### PESSOA JURIDICA ###");
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Loja A");
		pj.setCnpj("98.119.519/0001-98");
		pj.imprimirDados();


	}

}
