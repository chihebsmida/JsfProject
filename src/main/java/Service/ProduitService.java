package Service;

import Entity.Produit;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import java.util.List;

@ManagedBean
@SessionScoped
public class ProduitService implements ProduitServiceInterface
{
    @ManagedProperty("#{entityManagerFactoryBean.entityManger}")
    private EntityManager entityManager;


    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Produit> getAllProduct()
    {
        return entityManager.createQuery("select p FROM Produit p ").getResultList();
    }
}
