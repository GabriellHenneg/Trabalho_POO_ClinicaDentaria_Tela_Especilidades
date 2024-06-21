package negocio;

public class Registro {

	private String nome;
	private String telefone;
	private String data;
	private String hora;
	
	
	public Registro(String nome, String telefone, String data, String hora) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.hora = hora;
	}
	
	public Registro () {
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	
	
}