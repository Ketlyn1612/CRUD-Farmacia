package com.generation.farmacia.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O Nome é Obrigatório!")
	@Size(min = 5, max = 100, message = "O nome deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome;

	@UpdateTimestamp
	@Size(min = 6, max = 8, message = "A Validade deve conter no mínimo 6 e no máximo 8 caracteres!")
	private LocalDateTime validade;

	@NotNull(message = "O Preço é obrigatorio!")
	@Size(min = 2, max = 100, message = "A Categoria deve conter no mínimo 2 e no máximo 100 caracteres!")
	private double preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public LocalDateTime getValidade() {
		return validade;
	}

	public void setValidade(LocalDateTime validade) {
		this.validade = validade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
