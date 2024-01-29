package fr.dampierre;

public class App {

    public static void main(String[] args) {
        Employe employe = new Employe("Ronaldo", "Cristiano", 37, 2500);
        Employe employe2 = new Employe("Ghermaoui", "Youcef", 18, 2500);
        employe2.augmentationSalaire(20);
        afficherinfosEmploye(employe2);
        afficherinfosEmploye(employe);
    }

    private static void afficherinfosEmploye(Employe employe) {
        System.out.println(
                employe.getPrenom() + " " + employe.getNom() + " " + employe.getAge() + " " + employe.getSalaire());
    }

}
