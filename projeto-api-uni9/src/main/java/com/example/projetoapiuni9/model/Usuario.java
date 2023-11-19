package com.example.projetoapiuni9.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Column(name = "email", length = 100, nullable = false)
	private String email;
	
	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;
	
	@Column(name = "nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "nascimento", nullable = true)
	private String nascimento;
	
	@Id
	@Column(name = "cpf", length = 14, nullable = false)
	private Long cpf;
	
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
	
	
}