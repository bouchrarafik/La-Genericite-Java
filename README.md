# Activité pratique : La généricité

Ce dépôt contient l’exercice pratique sur l’utilisation de la généricité en Java avec une collection d’objets de type **Produit**.

---

## Objectif
Mettre en œuvre la généricité pour gérer une collection de produits et manipuler leurs informations via une interface générique.

---

## Exercice 1 : Gestion des produits

### Classes et interfaces

1. **Classe `Produit`**  
   - Attributs : `id`, `nom`, `marque`, `prix`, `description`, `nombreEnStock`  

2. **Interface générique `IMetier<T>`**  
   - Méthodes :  
     - `void add(T o)` – ajouter un objet à la liste  
     - `List<T> getAll()` – retourner la liste des objets  
     - `T findById(long id)` – retourner un produit par son id  
     - `void delete(long id)` – supprimer un produit par id  

3. **Classe `MetierProduitImpl`**  
   - Implémente `IMetier<Produit>`  
   - Contient une liste de produits et fournit l’implémentation des méthodes  

4. **Classe `Application`**  
   - Contient la méthode `main`  
   - Affiche un menu dans une boucle `while` pour permettre à l’utilisateur de :  
     1. Afficher la liste des produits  
     2. Rechercher un produit par son id  
     3. Ajouter un nouveau produit  
     4. Supprimer un produit par id  
     5. Quitter le programme  

---

## Technologies
- Java 17  
- Collection Java (`List`)  
- Concepts de généricité  

---

## Auteur
- Bouchra
