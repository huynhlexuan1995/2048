package huynlx.com.game;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame game = new JFrame();
        game.setTitle(" Start");
        game.setTitle("Huynh 2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(340, 480);
        game.setResizable(false);
        Start start = new Start(game);
        game.add(start);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
