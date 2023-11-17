/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import env3d.Env;
import env3d.advanced.EnvNode;
import org.lwjgl.input.Keyboard;

/**
 *
 * @author user
 */
public class Tux extends EnvNode {

    private Env env;
    private Room room;

    public Tux(Env env, Room room) {
        this.env = env;
        this.room = room;
        setScale(4.0);
        setX(50);// positionnement au milieu de la largeur de la room
        setY(getScale() * 1.1); // positionnement en hauteur basé sur la taille de Tux
        setZ(50); // positionnement au milieu de la profondeur de la room
        setTexture("C:\\Users\\user\\Downloads\\TuxLetterGame_template\\TuxLetterGame_template\\models\\tux\\tux_dead.png");
        setModel("models/tux/tux.obj");
    }

    public void deplace() {
        if (env.getKeyDown(Keyboard.KEY_Z) || env.getKeyDown(Keyboard.KEY_UP)) { // Fleche 'haut' ou Z
            // Haut
            this.setRotateY(180);
            this.setZ(this.getZ() - 1.0);
        }
        if (env.getKeyDown(Keyboard.KEY_Q) || env.getKeyDown(Keyboard.KEY_LEFT)) { // Fleche 'gauche' ou Q
            // Gauche
            this.setRotateY(90);
            this.setX(this.getX() - 1.0);
        }
        if (env.getKeyDown(Keyboard.KEY_S) || env.getKeyDown(Keyboard.KEY_DOWN)) {
            this.setRotateY(180);
            this.setZ(this.getZ() + 1.0);
        }
        if (env.getKeyDown(Keyboard.KEY_D) || env.getKeyDown(Keyboard.KEY_RIGHT)) {
            this.setRotateY(-90);
            this.setX(this.getX() + 1.0);
        }
    }
}
