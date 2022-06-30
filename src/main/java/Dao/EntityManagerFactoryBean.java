package Dao;


import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean()
@ApplicationScoped
public class EntityManagerFactoryBean
{
   private EntityManagerFactory entityManagerFactory;
   @PostConstruct()
    public void init()
   {
       this.entityManagerFactory= Persistence.createEntityManagerFactory("PERSISTENCE");
   }

    public EntityManagerFactory getEntityManagerFactory()
    {
        return entityManagerFactory;
    }

    public EntityManager getEntityManger()
    {
        return entityManagerFactory.createEntityManager();
    }

}
