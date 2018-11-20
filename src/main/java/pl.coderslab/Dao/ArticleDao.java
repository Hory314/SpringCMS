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

    public List<Article> findAll()
    {
        Query query = entityManager.createQuery("SELECT a FROM Article a");
        return query.getResultList();
    }

//    public void save(Article entity)
//    {
//        entityManager.persist(entity);
//    }
//
//    public void update(Article entity)
//    {
//        entityManager.merge(entity);
//    }
//
//    public Article findById(Long id)
//    {
//        return entityManager.find(Article.class, id);
//    }
//
//    public void delete(Article entity)
//    {
//        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
//    }
}
