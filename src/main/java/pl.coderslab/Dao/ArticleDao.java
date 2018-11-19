package pl.coderslab.Dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.Entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class ArticleDao extends AbstractDao<Article>
{
    @PersistenceContext // wstrzyknięcie entityManagera
    private EntityManager entityManager;


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
