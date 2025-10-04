package aplicacao;

import entities.Pessoa;
import entities.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, " João bilulas", " jo@gmail.com");
        Pessoa p2 = new Pessoa(null, " MAria joana", " MA@gmail.com");
        Pessoa p3 = new Pessoa(null, " Tadeu xian", " TA@gmail.com");

        Produto a1 = new Produto(null, " Pedro gabriel",455.0 );
        Produto a2 = new Produto(null, " Leandro cuscuz",502.0 );
        Produto a3 = new Produto(null, " Murilo petikoviche",603.0 );

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa");
        EntityManager em = emf.createEntityManager();



        Produto a = em.find(Produto.class,6 );

        em.getTransaction().begin();

        em.remove(a);


        a.setNome("uva");

//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.persist(a1);
//        em.persist(a2);
//        em.persist(a3);


        em.getTransaction().commit();
        em.close();
        emf.close();




//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
    }
}
