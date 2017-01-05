import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.algaworks.loja.model.Categoria;
import br.com.algaworks.loja.model.Produto;

public class teste {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		trx.commit();

	}

}
