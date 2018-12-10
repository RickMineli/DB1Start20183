package br.com.db1.db1start.recibo.endereco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.db1start.recibo.cidade.Cidade;
import br.com.db1.db1start.recibo.cidade.Uf;
import br.com.db1.db1start.recibo.pessoa.Pessoa;

public class EnderecoTest {	
	EntityManager em;

	@Before
	public void setUp() {
		EntityManagerFactory efm = Persistence.createEntityManagerFactory("db1start");
		em = efm.createEntityManager();
		em.getTransaction().begin();
	}

	@After
	public void after() {
		em.getTransaction().commit();
		em.close();
	}
	@Test
	public void deveSalvarUmNovoEndereco() {
		Pessoa pessoa = new Pessoa("Ricardo Mineli", "111111111111");
		Cidade cidade = new Cidade("Curitiba", Uf.PR);
		Endereco endereco = new Endereco(pessoa,cidade,"testes","128574","Casa","87190000",TipoLogradouro.AVENIDA);
		em.persist(endereco);
	}

}
