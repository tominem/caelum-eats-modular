package br.com.caelum.eats.restaurante.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import br.com.caelum.eats.administrativo.entidade.TipoDeCozinha;
import br.com.caelum.eats.seguranca.entidade.User;

@Entity
public class Restaurante {

	public Restaurante(Long id, @NotBlank @Size(max = 18) String cnpj, @NotBlank @Size(max = 255) String nome,
			@Size(max = 1000) String descricao, @NotBlank @Size(max = 9) String cep,
			@NotBlank @Size(max = 300) String endereco, @Positive BigDecimal taxaDeEntregaEmReais,
			@Positive @Min(10) @Max(180) Integer tempoDeEntregaMinimoEmMinutos,
			@Positive @Min(10) @Max(180) Integer tempoDeEntregaMaximoEmMinutos, Boolean aprovado,
			TipoDeCozinha tipoDeCozinha, User user) {
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.descricao = descricao;
		this.cep = cep;
		this.endereco = endereco;
		this.taxaDeEntregaEmReais = taxaDeEntregaEmReais;
		this.tempoDeEntregaMinimoEmMinutos = tempoDeEntregaMinimoEmMinutos;
		this.tempoDeEntregaMaximoEmMinutos = tempoDeEntregaMaximoEmMinutos;
		this.aprovado = aprovado;
		this.tipoDeCozinha = tipoDeCozinha;
		this.user = user;
	}

	public Restaurante() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 18)
	private String cnpj;

	@NotBlank
	@Size(max = 255)
	private String nome;

	@Size(max = 1000)
	private String descricao;

	@NotBlank
	@Size(max = 9)
	private String cep;

	@NotBlank
	@Size(max = 300)
	private String endereco;

	@Positive
	private BigDecimal taxaDeEntregaEmReais;

	@Positive
	@Min(10)
	@Max(180)
	private Integer tempoDeEntregaMinimoEmMinutos;

	@Positive
	@Min(10)
	@Max(180)
	private Integer tempoDeEntregaMaximoEmMinutos;

	private Boolean aprovado;

	@ManyToOne(optional = false)
	private TipoDeCozinha tipoDeCozinha;

	@OneToOne
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getTaxaDeEntregaEmReais() {
		return taxaDeEntregaEmReais;
	}

	public void setTaxaDeEntregaEmReais(BigDecimal taxaDeEntregaEmReais) {
		this.taxaDeEntregaEmReais = taxaDeEntregaEmReais;
	}

	public Integer getTempoDeEntregaMinimoEmMinutos() {
		return tempoDeEntregaMinimoEmMinutos;
	}

	public void setTempoDeEntregaMinimoEmMinutos(Integer tempoDeEntregaMinimoEmMinutos) {
		this.tempoDeEntregaMinimoEmMinutos = tempoDeEntregaMinimoEmMinutos;
	}

	public Integer getTempoDeEntregaMaximoEmMinutos() {
		return tempoDeEntregaMaximoEmMinutos;
	}

	public void setTempoDeEntregaMaximoEmMinutos(Integer tempoDeEntregaMaximoEmMinutos) {
		this.tempoDeEntregaMaximoEmMinutos = tempoDeEntregaMaximoEmMinutos;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	public TipoDeCozinha getTipoDeCozinha() {
		return tipoDeCozinha;
	}

	public void setTipoDeCozinha(TipoDeCozinha tipoDeCozinha) {
		this.tipoDeCozinha = tipoDeCozinha;
	}

	public User getUser() {
		return user;
	}

}
