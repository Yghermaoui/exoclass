package fr.dampierre;

public class Employe {
    private String prenom;
    private String nom;
    private int age;
    private double salaire;

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double getSalaire() {
        return salaire;
    }

    Employe(String nom, String prenom, int age, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }

    double augmentationSalaire(double pourcentage) {
        double petit = salaire / 100;
        double total = petit * pourcentage;
        double salaireFinal = total + salaire;
        return salaireFinal;
    }

    public void afficherinfos() {
        System.out.println("Nom : ");
    }

}
