import javax.swing.*;
import java.awt.*;

public class EndScreen extends JPanel {

    private int playerScore;

    public EndScreen(int playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw end screen graphics
        drawEndScreenGraphics(g);

        // Draw player score
        drawPlayerScore(g);
    }

    private void drawEndScreenGraphics(Graphics g) {
        // Customize this method to draw your end screen graphics
        // For example, you can draw a "Game Over" message or other visual elements
        g.setColor(Color.RED);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 36);
        g.setFont(font);
        String gameOverMessage = "Game Over!";
        int messageWidth = g.getFontMetrics().stringWidth(gameOverMessage);
        g.drawString(gameOverMessage, getWidth() / 2 - messageWidth / 2, getHeight() / 2);
    }

    private void drawPlayerScore(Graphics g) {
        // Draw the player's score on the end screen
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.PLAIN, 24);
        g.setFont(font);

        String scoreMessage = "Your Score: " + playerScore;
        int messageWidth = g.getFontMetrics().stringWidth(scoreMessage);
        g.drawString(scoreMessage, getWidth() / 2 - messageWidth / 2, getHeight() / 2 + 50);
    }

    // Example method to set the player's score
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public static void main(String[] args) {
        // Example of using EndScreen
        JFrame frame = new JFrame("End Screen Example");
        EndScreen endScreen = new EndScreen(1000); // Set the player's score
        frame.getContentPane().add(endScreen);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
