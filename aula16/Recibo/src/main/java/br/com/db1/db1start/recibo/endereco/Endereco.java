package br.com.db1.db1start.recibo.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.db1start.recibo.cidade.Cidade;
import br.com.db1.db1start.recibo.pessoa.Pessoa;

@Entity
@Table(name = "endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "pessoa_id", referencedColumnName = "id", nullable = false)
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "cidade_id", referencedColumnName = "id", nullable = false)
	private Cidade cidade;

	@Column(name = "logradouro", length = 100, nullable = false)
	private String logradouro;

	@Column(name = "numero", length = 6, nullable = false)
	private String numero;

	@Column(name = "complemeto", length = 20, nullable = false)
	private String complemento;

	@Column(name = "cep", length = 10, nullable = false)
	private String cep;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipoLogradouro", length = 8, nullable = false)
	private TipoLogradouro tipoLogradouro;

	protected Endereco() {

	}

	public Endereco(Pessoa pessoa, Cidade cidade, String logradouro, String numero, String complemento, String cep,
			TipoLogradouro tipoLogradouro) {
		super();
		this.pessoa = pessoa;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
	}
	

}
