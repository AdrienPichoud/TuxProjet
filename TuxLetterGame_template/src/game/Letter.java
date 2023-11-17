/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import env3d.Env;
import env3d.advanced.EnvNode;

/**
 *
 * @author user
 */
public class Letter extends EnvNode {

    private char letter;


    public Letter(char letter, double x, double y) {
        this.letter = letter;
        setScale(4.0);
        setX(x);// positionnement au milieu de la largeur de la room
        setY(y); // positionnement en hauteur basé sur la taille de Tux
        setZ(60); // positionnement au milieu de la profondeur de la room
        if(letter!=' '){
            setTexture("models/letter/"+letter+".png");
        }
        setModel("models/letter/cube.obj");
    }
}
