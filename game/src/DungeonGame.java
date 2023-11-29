import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DungeonGame extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 640;
    private static final int FRAME_HEIGHT = 640;

    private GameView gameView;
    private Timer gameTimer;

    public DungeonGame() {
        setTitle("Dungeon Game");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize( new Dimension( 640, 640 ));
        setResizable( false );
        setLocationRelativeTo(null);

        // Initialize game view
        gameView = new GameView();
        add(gameView);

        // Initialize game timer
        int delay = 16; // milliseconds (adjust as needed for your desired frame rate)
        gameTimer = new Timer(delay, this);
        gameTimer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update game logic
        updateGame();

        // Repaint the game view
        gameView.repaint();
    }

    private void updateGame() {
        // Add your game logic here
        // Handle player input, update game state, etc.
    }
}