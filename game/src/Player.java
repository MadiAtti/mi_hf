import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {

    private int x;
    private int y;
    private int width = 16;
    private int height = 16;
    private int speed = 16;

    public Player(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    public void draw(Graphics g) {
        // Draw the player at the current position
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public void move(int keyCode) {

        // Handle key events to move the player
        switch (keyCode) {
            case KeyEvent.VK_W:
                moveUp();
                break;
            case KeyEvent.VK_S:
                moveDown();
                break;
            case KeyEvent.VK_A:
                moveLeft();
                break;
            case KeyEvent.VK_D:
                moveRight();
                break;
        }
    }

    private void moveUp() {
        y -= speed;
    }

    private void moveDown() {
        y += speed;
    }

    private void moveLeft() {
        x -= speed;
    }

    private void moveRight() {
        x += speed;
    }

    // Getter methods for the player's position
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
