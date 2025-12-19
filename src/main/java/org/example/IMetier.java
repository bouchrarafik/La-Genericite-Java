package org.example;

import java.util.List;


/*
        - Créer une Interface générique IMetier qui va déclarer les méthodes pour gérer
nos entités Produit. Cette interface a un type générique T et contient les
        méthodes suivantes :
o public void add(T o) : qui permet d’ajouter un objet à la liste.
o public List<T> getAll() : qui retourne la liste des objets sous forme d’une
liste.
        o public T findById(long id) : qui retourne un produit par id.
o public void delete(long id) : qui supprime un objet par id.
        */
interface IMetier<T>{
    public void add(T o);
    public List<T> getAll();
    public T findById(long id);
    public void delete(long id);
}
