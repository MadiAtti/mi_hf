import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel {

    // Add your game objects and assets here
    // For example:
    private Player player;
    // private List<Enemy> enemies;
    private MapView dungeonMap;

    public GameView() {
        // Initialize your game objects here
        player = new Player( 312 , 312);
        // enemies = new ArrayList<>();
        dungeonMap = new MapView();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw your game objects here
        // For example:
        player.draw(g);
        // for (Enemy enemy : enemies) {
        //     enemy.draw(g);
        // }
        dungeonMap.draw(g);

        // Add any additional rendering logic based on your game state
    }

    // Add additional methods for updating the view based on the game state
    // For example:
    // public void updatePlayerPosition(int x, int y) {
    //     player.setPosition(x, y);
    //     repaint();
    // }

    // Add methods for handling user input if necessary
    // For example:
    // public void handleKeyPress(int keyCode) {
    //     // Handle key press events
    // }
}
