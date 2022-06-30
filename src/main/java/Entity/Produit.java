package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private String designation;
    private float prix;
    private int quantité;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public float getPrix() {
    return prix;
  }

  public void setPrix(float prix) {
    this.prix = prix;
  }

  public int getQuantité() {
    return quantité;
  }

  public void setQuantité(int quantité) {
    this.quantité = quantité;
  }
}
