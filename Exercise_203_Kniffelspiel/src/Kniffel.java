/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcs
 */
public class Kniffel {
    private String game;
    private int points;
    private boolean choice;

    public Kniffel(String game, int points, boolean choice) {
        this.game = game;
        this.points = points;
        this.choice = choice;
    }

    public String getGame() {
        return game;
    }

    public int getPoints() {
        return points;
    }

    public boolean isChoice() {
        return choice;
    }
    
    
}
