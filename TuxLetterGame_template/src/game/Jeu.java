/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import env3d.Env;
import java.util.ArrayList;
public class Jeu {

    private Env env;
    private Room room;
    private Profil profil;
    private Tux tux;
    private ArrayList<Letter> letters;
    private Dico dictionnaire;

    public Jeu() {
        letters=new ArrayList<>();
        // Crée un nouvel environnement
        env = new Env();

        // Instancie une Room
        room = new Room();
        // Règle la camera
        env.setCameraXYZ(50, 60, 175);

        env.setCameraPitch(-20);

        // Désactive les contrôles par défaut
        env.setDefaultControl(false);
        tux = new Tux(env, room);
        // Instancie un profil par défaut
        profil = new Profil();
        dictionnaire=new Dico("dgdsfv");

    }

    public void execute() {
        // pour l'instant, nous nous contentons d'appeler la méthode joue comme cela
        // et nous créons une partie vide, juste pour que cela fonctionne
        joue(new Partie());

        // Détruit l'environnement et provoque la sortie du programme 
        env.exit();
    }

    public void joue(Partie partie) {
        // TEMPORAIRE : on règle la room de l'environnement. Ceci sera à enlever lorsque vous ajouterez les menus.
        env.setRoom(room);
        Random x = new Random(0,60);
        Random y = new Random (0,60);
        // Instancie un Tux
        tux=new Tux(env,room);
        dictionnaire.ajouteMotADico(1, "mot");
        letters=new ArrayList<>();
        for(char c : dictionnaire.getMotDepuisListeNiveau(1).toCharArray()){
            letters.add(new Letter(c,x.get(),y.get()));
        }

                // Ici, on peut initialiser des valeurs pour une nouvelle partie
        demarrePartie(partie);

        // Boucle de jeu
        Boolean finished;
        finished = false;
        env.addObject(tux);
        env.addObject(letters.get(0));
        env.addObject(letters.get(1));
        env.addObject(letters.get(2));
        while (!finished) {

            // Contrôles globaux du jeu (sortie, ...)
            //1 is for escape key
            if (env.getKey() == 1) {
                finished= true;
            }

            // Contrôles des déplacements de Tux (gauche, droite, ...)
            // ... (sera complété plus tard) ...
            // Ici, on applique les regles
            appliqueRegles(partie);

            // Fait avancer le moteur de jeu (mise à jour de l'affichage, de l'écoute des événements clavier...)
            env.advanceOneFrame();
        }

        // Ici on peut calculer des valeurs lorsque la partie est terminée
        terminePartie(partie);
    }

    protected void demarrePartie(Partie partie) {

    }

    protected void appliqueRegles(Partie partie) {

    }

    protected void terminePartie(Partie partie) {

    }

}
