package poo;

import java.util.ArrayList;
import java.util.List;

public class Socio {

	private int id;
	private int matricula;
    private String nome;
    private int cpf;
    private String endereco;
    private String email;
    private int telefone;
    private List<String> dependentes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public List<String> getDependentes() {
		return dependentes;
	}
	public void setDependentes(List<String> dependentes) {
		this.dependentes = dependentes;
	}
    
    

}