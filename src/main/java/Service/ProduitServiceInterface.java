package Service;

import Entity.Produit;

import java.util.List;

public interface ProduitServiceInterface
{
List<Produit> getAllProduct();
String redirectToAddProduct();
String AddProduct(Produit produit);
String redirectToEditProduct(Produit produit);
String UpdateProduct(Produit p);
String supprimerProduct(Produit p);
}
