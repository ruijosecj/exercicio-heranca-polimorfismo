
public class PessoaFisica extends Pessoa{
	
	private String cpf;
	private Integer idade;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public void imprimirDados() {
		System.out.println("Nome: " + getNome() + " -" + " Idade: " + getIdade() + " -" + " CPF: " + getCpf());
		
	}
	
	

}
