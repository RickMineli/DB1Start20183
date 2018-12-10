package br.com.db1.db1start.recibo.pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
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
	public void deveSalvarUmaNovaPessoa() {
		Pessoa pessoa = new Pessoa("Ricardo Mineli", "111111111111");
		em.persist(pessoa);
	}
}
