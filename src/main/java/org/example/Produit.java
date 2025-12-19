package org.example;

/*
    L’objectif de cet exercice est d’utiliser la généricité avec une collection d'objets de type
    produit .
    - Créez une classe Produit avec les attributs id, nom, marque, prix, description,
    et nombre en stock.
*/


public class Produit{
    int id;
    String nom;
    String marque;
    Double prix;
    String description;
    int nbrStock = 0;

    public Produit(int id, String nom, String marque, Double prix, String description, int nbrStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbrStock = nbrStock;
    }

    public String toString(){
        return "Produit { id = '" + this.id + "', nom = '"
                + this.nom + "', marque = '" + this.marque
                + "', prix = '" + this.prix + "DH', description = '"
                + this.description + "', nbrStock = '" + this.nbrStock + "' }";
    }
}

