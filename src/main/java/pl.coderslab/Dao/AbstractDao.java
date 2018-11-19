package pl.coderslab.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao<T>
{
    @PersistenceContext
    EntityManager entityManager;

    public void save(T entity)
    {
        entityManager.persist(entity);
    }

    public void update(T entity)
    {
        entityManager.merge(entity);
    }

    public T findById(Long id)
    {
        return entityManager.find(T.class, id);
    }

    public void delete(T entity)
    {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }
}
