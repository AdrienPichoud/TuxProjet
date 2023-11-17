/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Dico {

    private ArrayList<String> listeNiveau1;
    private ArrayList<String> listeNiveau2;
    private ArrayList<String> listeNiveau3;
    private ArrayList<String> listeNiveau4;
    private ArrayList<String> listeNiveau5;
    private String cheminFichierDico;

    public Dico(String cheminFichierDico) {
        listeNiveau1 = new ArrayList<>();
        listeNiveau2 = new ArrayList<>();
        listeNiveau3 = new ArrayList<>();
        listeNiveau4 = new ArrayList<>();
        listeNiveau5 = new ArrayList<>();
        this.cheminFichierDico = cheminFichierDico;
    }

    private int verifieNiveau(int niveau) {
        if (niveau < 1 || niveau > 5) {
            Random r = new Random(1, 5);
            niveau = (int) r.get();
        }
        return niveau;
    }

    private String getMotDepuisListe(ArrayList<String> listeNiveau) {
        Random r = new Random(0, listeNiveau.size() - 1);
        if (listeNiveau.isEmpty()) {
            return "";
        }
        return listeNiveau.get((int) r.get());
    }

    public String getMotDepuisListeNiveau(int niveau) {
        String mot = "";
        switch (verifieNiveau(niveau)) {
            case 1:
                mot = getMotDepuisListe(listeNiveau1);
                break;
            case 2:
                mot = getMotDepuisListe(listeNiveau2);
                break;
            case 3:
                mot = getMotDepuisListe(listeNiveau3);
                break;
            case 4:
                mot = getMotDepuisListe(listeNiveau4);
                break;
            case 5:
                mot = getMotDepuisListe(listeNiveau5);
                break;
            default:
                System.out.println("Erreur niveau\n");

        }
        return mot;
    }

    public void ajouteMotADico(int niveau, String mot) {
        switch (verifieNiveau(niveau)) {
            case 1:
                listeNiveau1.add(mot);
                break;
            case 2:
                listeNiveau2.add(mot);
                break;
            case 3:
                listeNiveau3.add(mot);
                break;
            case 4:
                listeNiveau5.add(mot);
                break;
            case 5:
                listeNiveau5.add(mot);
                break;
        }
    }
    
}
