import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
    }

    private static void menu(Scanner scanner){

        boolean arret = true;

        //Boucle pour le menu
        while (arret){
            System.out.println("Veuillez choisir une option :");
            System.out.println("1 pour ajouter un livre:");
            System.out.println("2 pour supprimer un livre:");
            System.out.println("3 pour afficher la liste des livres:");
            System.out.println("4 pour arrêter le programme :");
            int choix = scanner.nextInt();
            switch (choix){
                case 1:
                    Livre livre = new Livre();
                    System.out.println("Veuillez saisir le titre du livre");
                    String titre = scanner.next();
                    livre.setTitre(titre);
                    System.out.println("Veuillez saisir la description du livre");
                    String description = scanner.next();
                    livre.setDescription(description);
                    System.out.println("Veuillez saisir la date de parution du livre");
                    String date = scanner.next();
                    livre.setDatePublication(date);
                    boolean genres = true;
                    while (genres) {
                        System.out.println("Voulez-vous ajouter un genre O ou N");
                        String reponse = scanner.next();
                        if(reponse.equals("O")){
                            System.out.println("Veuillez saisir le nom du genre:");
                            String genre = scanner.next();
                            livre.setGenre(genre);
                            System.out.println("Voulez vous continuer O ou N");
                            reponse = scanner.next();
                        }else{
                            genres = false;
                            System.out.println("Vous avez terminé");
                        }
                    }
                    Livre.add(livre);
                    System.out.println("Le livre a été ajouté à la liste");
                    break;
                case 2:
                    System.out.println("Choisir le titre du livre à supprimer");
                    String chercher = scanner.next();
                    for (Livre livrechercher : Livre.livres) {
                        if(livrechercher.getTitre().contains(chercher)) {
                            Livre trouve = livrechercher;
                            Livre.livres.remove(trouve);
                        }
                    }
                    System.out.println("Le livre à été supprimé de la liste");
                    break;
                case 3:
                    System.out.println("Liste des livres");
                    Livre.findAll();
                    break;
                case 4:
                    System.out.println("Arret du programme :");
                    break;
            }

        }
    }
}