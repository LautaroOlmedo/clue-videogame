package main;

import view.GameBoard;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setResizable(false);
        gameBoard.setTitle("2D Clue ¿Quién borró la base de datos?");
        gameBoard.pack();
        gameBoard.setLocationRelativeTo(null);
        gameBoard.setVisible(true);
    }
}