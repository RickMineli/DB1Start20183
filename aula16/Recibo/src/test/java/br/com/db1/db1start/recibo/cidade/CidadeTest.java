package br.com.db1.db1start.recibo.cidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.db1start.recibo.cidade.Cidade;
import br.com.db1.db1start.recibo.cidade.Uf;
import br.com.db1.db1start.recibo.endereco.Endereco;
import br.com.db1.db1start.recibo.pessoa.Pessoa;

public class CidadeTest {
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
	public void deveSalvarUmaNovaCidade() {
		Cidade cidade = new Cidade("Curitiba", Uf.PR);
		em.persist(cidade);
	}

	@Test
	public void deveAlterarCidade() {
		Query query = em.createQuery("select c from Cidade c where c.nome = :pNome");
		query.setParameter("pNome", "Maring�");
		query.setMaxResults(1);
		Cidade cidade = (Cidade) query.getSingleResult();
		cidade.alteraNome("Campo Mour�o");
		em.persist(cidade);
	}

}
