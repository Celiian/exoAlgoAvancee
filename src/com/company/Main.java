package com.company;

public class Main {

    public static void main(String[] args) {
        int prixProduit = 10;

        float prixProduitFinal = prixProduit;

        prixProduitFinal = prixProduitFinal - (50 * prixProduitFinal /100);
        prixProduitFinal = prixProduitFinal - (30 * prixProduitFinal /100);

        System.out.println(prixProduitFinal);

        float prixFinal = Reductionprix(30, Reductionprix(50, prixProduit));
        System.out.println(prixFinal);


        int[] tabreduc = new int[2];
        tabreduc[0] = 50;
        tabreduc[1] = 30;

        System.out.println(Reduc(10, tabreduc));

    }


    public static float Reductionprix(int pourcentage, float prix){
        prix = prix - (pourcentage * prix /100);
        return prix;
    }


    public static String Reduc(int prixOriginal, int[] tabReduc){
        float prix = prixOriginal;
        for (int i = 1; i < tabReduc.length; i ++ ){
                if (tabReduc[i] > tabReduc[i-1]){
                     return  "ERREUR : Veuillez ranger vos prix par ordre décroissant";
                }
        }
        for (int pourcentage:tabReduc) {
            prix = prix - (pourcentage * prix / 100);
        }

        return "Prix avec réductions : " + prix;
    }
}
