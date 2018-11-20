package pl.coderslab.Dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.Entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.awt.print.Book;
import java.util.List;

@Component
@Transactional
public class ArticleDao extends AbstractDao<Article>
{
    @PersistenceContext // wstrzyknięcie entityManagera
    private EntityManager entityManager;

    public List<Article> findAll(Integer limit)
    {

//        Query query = entityManager.createQuery("SELECT a FROM Article a ORDER BY a.created DESC");
        Query query = entityManager.createQuery("SELECT a FROM Article a ORDER BY a.created DESC");
        if (limit != null) query.setMaxResults(limit);
        return query.getResultList();
    }

    public List<Article> findAll()
    {
        return findAll(null);
    }
}
