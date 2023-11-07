package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length != 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }

        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String chaine = parameters[3];

        if (depart < 0 || fin < 0 || depart >= fin || fin > document.getTexte().length()) {
            System.err.println("Paramètres invalides. Veuillez vérifier les valeurs de départ et de fin.");
            return;
        }

        this.document.remplacer(depart, fin, chaine);
        super.executer();
    }
}
