package Service;

import Entity.Produit;

import java.util.List;

public interface ProduitServiceImpl
{
List<Produit> getAllProduct();
String redirectToAddProduct();
String AddProduct(Produit produit);
String redirectToEditProduct();
String UpdateProduct(Produit p);
String supprimerProduct(Produit p);
}
