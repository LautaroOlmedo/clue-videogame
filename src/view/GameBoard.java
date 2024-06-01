package view;

import javax.swing.*;

public class GameBoard extends JFrame {
    public GameBoard(){
        this.gamePanel = new GamePanel();
        this.add(gamePanel);
        this.gamePanel.startGameThread();

    }

    private GamePanel gamePanel;
}
