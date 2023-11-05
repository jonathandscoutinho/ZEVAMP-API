package com.example.projetoapiuni9.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@CrossOrigin
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "email", length = 100, nullable = false)
	private String email;
	
	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;
	
	@Column(name = "nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "nascimento", nullable = true)
	private Date nascimento;
	
	@Column(name = "cpf", length = 14, nullable = false)
	private String cpf;
	
	@Column(name = "telefone", length = 18, nullable = false)
	private String telefone;
	
	@Column(name = "altura", precision = 4, scale = 1, nullable = false)
	private BigDecimal altura;
	
	@Column(name = "peso", precision = 4, scale = 1, nullable = false)
	private BigDecimal peso;
	
	@Column(name = "sexo", length = 10, nullable = true)
	private String sexo;
	
	@Column(name = "sangue", length = 10, nullable = true)
	private String sangue;
	
	@Column(name = "rua", length = 100, nullable = false)
	private String rua;
	
	@Column(name = "bairro", length = 100, nullable = false)
	private String bairro;
	
	@Column(name = "municipio", length = 100, nullable = false)
	private String municipio;
	
	@Column(name = "uf", length = 2, nullable = false)
	private String uf;
	
	@Column(name = "numero", nullable = false)
	private Integer numero;
	
	@Column(name = "cep", length = 10, nullable = false)
	private String cep;
	
	@Column(name = "complemento", length = 100, nullable = true)
	private String complemento;
	
	@Column(name = "possui_doenca", length = 1, nullable = true)
	private Boolean possui_doenca;
	
	@Column(name = "doenca", nullable = true)
	private Integer doenca;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSangue() {
		return sangue;
	}

	public void setSangue(String sangue) {
		this.sangue = sangue;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Boolean getPossui_doenca() {
		return possui_doenca;
	}

	public void setPossui_doenca(Boolean possui_doenca) {
		this.possui_doenca = possui_doenca;
	}

	public Integer getDoenca() {
		return doenca;
	}

	public void setDoenca(Integer doenca) {
		this.doenca = doenca;
	}
	
	
	
}