import javax.swing.*;
import java.awt.*;

public class MapView extends JPanel {

    private int[][] dungeonMap;

    public MapView() {

         dungeonMap = new int[][]{
                 {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0 ,1},
                 {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
         };
    }

    public void draw(Graphics g) {
        // Draw the dungeon map based on the map data
        // Customize this method based on your specific map rendering logic
        int tileSize = 64; // Replace with your desired tile size

        for (int i = 0; i < dungeonMap.length; i++) {
            for (int j = 0; j < dungeonMap[i].length; j++) {
                if (dungeonMap[i][j] == 1) {
                    // Draw a wall tile
                    g.setColor(Color.BLACK);
                    g.fillRect(j * tileSize, i * tileSize, tileSize, tileSize);
                } else {
                    // Draw an empty space
                    g.setColor(Color.GRAY);
                    g.fillRect(j * tileSize, i * tileSize, tileSize, tileSize);
                }
            }
        }
    }
}
