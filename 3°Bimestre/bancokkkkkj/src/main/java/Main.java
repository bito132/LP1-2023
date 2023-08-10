import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("joão1", "vitor1", "bito1@gmail.com");
        Pessoa pessoa2 = new Pessoa("joão2", "vitor2", "bito2@gmail.com");
        Pessoa pessoa3 = new Pessoa("joão3", "vitor3", "bito3@gmail.com");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(pessoa1);
        session.persist(pessoa2);
        session.persist(pessoa3);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p));

      /*  for (Pessoa p: pessoas){
            System.out.println(p);
        } */
    }
}
