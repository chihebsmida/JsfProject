package Service;

import Entity.Produit;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.Map;

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

    @Override
    public String redirectToAddProduct() {
        Produit produit=new Produit();
        Map<String,Object> sessionMap= FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        sessionMap.put("pr",produit);
        return "/faces/AjouterProduit.xhtml";
    }

    @Override
    public String AddProduct(Produit produit)
    {
        entityManager.getTransaction().begin();
        entityManager.persist(produit);
        entityManager.getTransaction().commit();
        return "/faces/index.xhtml";
    }

    @Override
    public String redirectToEditProduct(Produit produit) {

        Map<String,Object> sessionMap= FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        sessionMap.put("editPr",produit);
        return "/faces/MiseAjourProduit.xhtml";

    }

    @Override
    public String UpdateProduct(Produit p)
    {
        entityManager.getTransaction().begin();
        entityManager.merge(p);
        entityManager.getTransaction().commit();
        return "/faces/index.xhtml";
    }

    @Override
    public String supprimerProduct(Produit p) {
        entityManager.getTransaction().begin();
        entityManager.remove(p);
        entityManager.getTransaction().commit();
        return "/faces/index.xhtml";
    }
}
