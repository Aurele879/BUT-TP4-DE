package Exercice1;

import java.util.ArrayList;
import java.util.List;

public class Arbre {

    String valeur;
    List<Arbre> fils = new ArrayList<>();

    public Arbre(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return this.valeur;
    }

    public void setValeur(String element) {
        this.valeur = element;
    }

    public List<Arbre> getFils() {
        return this.fils;
    }

    public void addFils(Arbre element) {
        fils.add(element);
    }

    @Override
    public String toString() {
        List<String> liste = new ArrayList<>();
        parcoursPrefixe(liste);
        return String.join(", ", liste);
    }

    public void parcoursPrefixe(List<String> resultat) {
        resultat.add(getValeur());
        for (Arbre f : this.fils)
            if (f != null) {
                f.parcoursPrefixe(resultat);
            }
        }
    }

/*
    1 - Une structure d'arbre peut etre utilisée dans un systeme hierarchique, dans la gestion de fichiers ou des arbres en UML.
    3) On retrouve les parcours : préfixe, infixe, postfixe et en largeur.
    4) Dans ce cas, on utilise un parcours préfixe.
 */