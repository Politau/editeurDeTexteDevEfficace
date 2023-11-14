package fr.iut.editeur.document;

public class Document {

    // La chaîne de texte du document
    private String texte;

    // Constructeur par défaut
    public Document() {
        // Initialise la chaîne de texte avec une chaîne vide
        this.texte = "";
    }

    // Getter pour obtenir le texte du document
    public String getTexte() {
        return texte;
    }

    // Setter pour définir le texte du document
    public void setTexte(String texte) {
        this.texte = texte;
    }

    // Ajoute une chaîne de texte à la fin du document
    public void ajouter(String texte) {
        this.texte += texte;
    }

    // Redéfinition de toString pour obtenir la représentation texte du document
    @Override
    public String toString() {
        return this.texte;
    }

    // Remplace une partie du texte par une nouvelle chaîne
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    // Convertit en majuscules une partie du texte
    public void majuscules(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String modif = texte.substring(start, end).toUpperCase();
        texte = leftPart + modif + rightPart;
    }

    // Efface une partie du texte
    public void effacer(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + "" + rightPart;
    }

    // Efface complètement le texte du document
    public void clear(){
        texte= "";
    }
}
