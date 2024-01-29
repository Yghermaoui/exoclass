package fr.dampierre;

public class Comptebancaire {
    private String proprietaire;
    private double solde;

    public Comptebancaire(String proprietaire, double soldeInitial) {
        this.proprietaire = proprietaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        this.solde += montant;
        System.out.println("Dépôt de " + montant + " euros effectué. Nouveau solde : " + this.solde + " euros");
    }

    public void afficherInformations() {
        System.out.println("Informations du compte de " + this.proprietaire + ":");
        System.out.println("Solde actuel : " + this.solde + " euros");
    }
}