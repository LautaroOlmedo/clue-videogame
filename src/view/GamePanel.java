package view;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable { // ---> Pantalla del juego

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){
        this.gameThread = new Thread(this);
        this.gameThread.start();
    }

    @Override
    public void run() {
        while(this.gameThread != null){
            System.out.println("Hello world");
            // 1. UPDATE INFORMATION: update information such a character position
            update();
            // 2. DRAW: draw the screen with the updated information
            repaint();
        }
    }

    public void update(){}
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.white);
        g2d.fillRect(100, 100, tileSize, tileSize);
        g2d.dispose();
    }





    // SCREEN SETTINGS
    final int originalTieSize = 16; // ---> tamaño de los objetos
    final int scale = 3;

    final int tileSize = originalTieSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixeles
    final int screenHeight = tileSize * maxScreenRow; // 576 pixeles
    private Thread gameThread;


}
