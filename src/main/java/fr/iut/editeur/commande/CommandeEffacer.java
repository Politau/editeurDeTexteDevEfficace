package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeEffacer extends CommandeDocument {

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        if (depart < 0 || fin < 0 || depart >= fin || fin > document.getTexte().length()) {
            System.err.println("Paramètres invalides. Veuillez vérifier les valeurs de départ et de fin.");
            return;
        }

        document.effacer(depart, fin);
        super.executer();
    }
}
