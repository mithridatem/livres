import java.util.ArrayList;

public class Livre {
    //Attributs

    private String titre;
    private String description;
    private String datePublication;
    private ArrayList<String> genre;
    static ArrayList<Livre> livres;
    //constructeurs

    public Livre() {
    }

    public Livre(String titre, String description, String datePublication, ArrayList<String> genre) {
        this.titre = titre;
        this.description = description;
        this.datePublication = datePublication;
        this.genre = genre;
    }

    //getters et setters

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre.add(genre);
    }

    //méthodes
    public static void add(Livre livre) {
        livres.add(livre);
    }

    public static void remove(Livre livre) {
        livres.remove(livre);
    }
    public String getGenres() {
        String genres = "";
        for (String genre : genre) {
            genres += ", " + genre;
        }
        return genres;
    }

    public static void findAll() {
        for (Livre livre : livres) {
            System.out.println("titre: " + livre.getTitre() +
                    " description: " + livre.getDescription() +
                    " date: " + livre.getDatePublication() +
                    " genres: " + livre.getGenres()
            );
        }
    }
}
