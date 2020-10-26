package cadastro;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String celular;
	
	public PessoaFisica(int id, String nome, String email, String cpf, String celular) {
		super(id, nome, email);
		this.cpf = cpf;
		this.celular = celular;
	}
	
	@Override
	public void imprimir() {
/*		System.out.println("ID: " + getId());
		System.out.println("Nome: ".concat(getNome()));
		System.out.println("E-mail: ".concat(getEmail()));
		System.out.println("CPF: ".concat(getCpf()));
		System.out.println("Telefone Celular: ".concat(getCelular()));
*/
		System.out.println(this);
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nCPF: " + getCpf() +
				"\nTelefone Celular: " + getCelular();
	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {

		this.cpf = cpf;
	}

	public String getCelular() {

		return celular;
	}

	public void setCelular(String celular) {

		this.celular = celular;
	}
	
}
