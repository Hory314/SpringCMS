package pl.coderslab.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractDao<E>
{
    protected Class<E> entityClass;


    @PersistenceContext
    protected EntityManager entityManager;


    public AbstractDao()
    {
//        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
//        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
    }


    public void save(E entity)
    {
        entityManager.persist(entity);
    }

    public void update(E entity)
    {
        entityManager.merge(entity);
    }

    public E findById(Long id)
    {
        //return entityManager.find(entityClass, id);
        return entityManager.find((Class<E>) getClass().getGenericSuperclass(), id); // ?
    }

    public void delete(E entity)
    {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }
}
