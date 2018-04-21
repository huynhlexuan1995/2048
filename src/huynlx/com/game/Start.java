package huynlx.com.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JPanel implements ActionListener {
    private JButton btnClick;
    private JFrame frame;
    public Start(JFrame frame){
        this.frame = frame;
        setBackground(Color.BLUE);
        setLayout(null);
        setSize(500,1000);


        btnClick = new JButton();
        btnClick.setSize(100, 50);
        btnClick.setText("Start");
        btnClick.setLocation(100, 150);
        btnClick.addActionListener(this);
        add(btnClick);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.remove(this);
        Game2048 game2048 = new Game2048();
        frame.add(game2048);
        game2048.setFocusable(true);
        game2048.setRequestFocusEnabled(true);
        game2048.requestFocus();
        frame.repaint();
        //add main play
        //remove start
    }
}
