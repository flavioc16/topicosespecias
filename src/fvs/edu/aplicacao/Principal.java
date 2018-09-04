package fvs.edu.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fvs.edu.dominio.Aluno;

public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("topicos-fvs");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();
		
		//Aluno aluno1 = new Aluno
		//(null, "Flavio", "067.997.243-90", "20082078461", 9491);
		//em.persist(aluno1);
		//em.getTransaction().commit();
		Aluno aluno = em.find(Aluno.class, 1);
		System.out.println(aluno);
	}

}
