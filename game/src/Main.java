import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DungeonGame dungeonGame = new DungeonGame();
            dungeonGame.setVisible(true);
        });
    }
}
