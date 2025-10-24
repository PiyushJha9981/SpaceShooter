import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
    int tileSize = 32;
    int rows = 16;
    int columns = 16;
    int boardWidth = tileSize * columns;
    int boardHeight = tileSize * rows;

    JFrame frame = new JFrame("Space Shooting");
    frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    SpaceShooter spaceShooter = new SpaceShooter();
    frame.add(spaceShooter);
    frame.pack();
    spaceShooter.requestFocus();
    frame.setVisible(true);

    }
}
