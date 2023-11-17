
import game.Dico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class TestDico {
    public static void main(String[] args){
        Dico dictionnaire = new Dico("cdsfs");
        dictionnaire.ajouteMotADico(1,"dico");
        dictionnaire.ajouteMotADico(1,"plusieurs");
        dictionnaire.ajouteMotADico(5, "mot");
        dictionnaire.ajouteMotADico(8, "erreur");
        dictionnaire.ajouteMotADico(3,"tp");
        System.out.println(dictionnaire.getMotDepuisListeNiveau(1)+dictionnaire.getMotDepuisListeNiveau(1)+dictionnaire.getMotDepuisListeNiveau(8)+dictionnaire.getMotDepuisListeNiveau(2)+dictionnaire.getMotDepuisListeNiveau(3)+dictionnaire.getMotDepuisListeNiveau(4));
    }
}
