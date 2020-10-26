package cadastro;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String inscricaoEstadual;
	private String telefoneFixo;
	
	public PessoaJuridica(int id, String nome, String email, String cnpj, String inscricaoEstadual, String telefoneFixo) {
		super(id, nome, email);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.telefoneFixo = telefoneFixo;
		
	}

/*	@Override
	public void imprimir() {
		System.out.println("ID: " + getId());
		System.out.println("Nome: ".concat(getNome()));
		System.out.println("E-mail: ".concat(getEmail()));
		System.out.println("CPF: ".concat(getCnpj()));
		System.out.println("Telefone Celular: ".concat(getTelefoneFixo()));
	}
*/
	public String getCnpj() {

		return cnpj;
	}

	public void setCnpj(String cnpj) {

		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {

		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {

		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getTelefoneFixo() {

		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {

		this.telefoneFixo = telefoneFixo;
	}

}
