package com.company;

public class Main {

    public static void main(String[] args) {
        int prixProduit = 10;

        int prixProduitFinal = prixProduit;

        prixProduitFinal = prixProduitFinal - (50 * prixProduitFinal /100);
        prixProduitFinal = prixProduitFinal - (30 * prixProduitFinal /100);

        System.out.println(prixProduitFinal);

        int prixFinal = Reductionprix(30, Reductionprix(50, prixProduit));
        System.out.println(prixFinal);
    }


    public static int Reductionprix(int pourcentage, int prix){
        prix = prix - (pourcentage * prix /100);

        return prix;
    }
}
