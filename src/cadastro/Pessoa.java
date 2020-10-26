package cadastro;

public class Pessoa {
	
	private int id;
	private String nome;
	private String email;
	
	public Pessoa(int id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		
	}

	public void imprimir(){
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "ID: " + getId() +
				"\nNome: " + getNome() +
				"\nE-mail: " + getEmail();
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email = email;
	}

}
