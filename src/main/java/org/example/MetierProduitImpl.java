package org.example;


import java.util.ArrayList;
import java.util.List;


/*
    - Créer une classe MetierProduitImpl qui implémente l’interface IMetier. Cette classe
    contient un attribut qui représente une liste de produits.
 */
class MetierProduitImpl implements IMetier<Produit>{
    List<Produit> listProduit;

    public MetierProduitImpl() {
        this.listProduit = new ArrayList<>();
    }

    @Override
    public void add(Produit o) {
        this.listProduit.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return this.listProduit;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : this.listProduit) {
            if(produit.id == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        for (Produit produit : this.listProduit) {
            if(produit.id == id) {
                this.listProduit.remove(produit);
                break;
            }
        }
    }
}
