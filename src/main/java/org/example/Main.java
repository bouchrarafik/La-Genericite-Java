package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    - Ecrire une classe Application contenant la méthode main qui propose à l’utilisateur
    dans une boucle while le menu suivant :
    1. Afficher la liste des produits.
    2. Rechercher un produit par son id.
    3. Ajouter un nouveau produit dans la liste.
    4. Supprimer un produit par id.
    5. Quitter ce programme.
*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();
        metier.add(new Produit(265, "clavier", "logitech", 250.25, "clavier sans fils", 6));
        metier.add(new Produit(336, "souris", "logitech", 150.25, "souris sans fils", 6));
        metier.add(new Produit(25, "casque", "Reddragon", 120.25, "casque sans fils", 6));

        while (true) {
            System.out.println("=========Menu=========");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");

            System.out.print("Votre choix: ");
            int choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        if(metier.getAll().isEmpty()){
                            System.out.println("La liste des produits est vide.\n");
                            break;
                        }
                        System.out.println(metier.getAll() + "\n\n");
                        break;

                    case 2:
                        System.out.print("Entrer l'id du produit à rechercher: ");
                        long id = scanner.nextLong();
                        if (metier.findById(id) == null) {
                            System.out.println("Produit Introuvable");
                            break;
                        }
                        System.out.println(metier.findById(id));
                        break;

                    case 3:


                        System.out.print("Entrer ID du produit: ");
                        int id_prod = scanner.nextInt();
                        scanner.nextLine();

                        if(metier.findById(id_prod) != null){
                            System.out.println("Un produit avec cet ID existe déjà.");
                            break;
                        }



                        System.out.print("Entrer le nom du produit: ");
                        String nom = scanner.nextLine();

                        System.out.print("Entrer la marque du produit: ");
                        String marque = scanner.nextLine();

                        System.out.print("Entrer le prix du produit: ");
                        double prix = scanner.nextDouble();
                        scanner.nextLine();



                        System.out.print("Entrer la description du produit: ");
                        String description = scanner.nextLine();

                        System.out.print("Entrer le nombre en stock du produit: ");
                        int nbrStock = scanner.nextInt();




                        metier.add(new Produit(id_prod, nom, marque, prix, description, nbrStock));

                        break;



                    case 4:
                        System.out.print("Entrer ID du produit: ");
                        int id_to_remove = scanner.nextInt();

                        if(metier.findById(id_to_remove) == null){
                            System.out.println("le produit n'existe pas");
                            break;
                        }

                        metier.delete(id_to_remove);
                        break;

                    case 5:

                        System.out.println("Au revoir");
                        return;

                    default:
                        System.out.println("Choix invalid");
                }

            }


        }
    }

