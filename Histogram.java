// This program takes an input file of homework scores ranging from 0 to 86
// and it prints a text and graphical histogram showing the frequencies of
// each homework score.

import java.io.*;
import java.awt.*;
import java.util.*;

public class Histogram {
    public static final int MAX_SCORE = 86;  // max possible score

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("homework.txt"));
        
        // read file into count array
        int[] count = new int[MAX_SCORE + 1];
        while (input.hasNextInt()) {
            int score = input.nextInt();
            count[score]++;
        }

        // use array to produce a histogram
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.print(i + ": ");
                for (int j = 1; j <= count[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        draw(count);
    }

    // Uses a DrawingPanel to draw the histogram
    public static void draw(int[] count) {
        DrawingPanel panel = new DrawingPanel(count.length * 6 + 12, 500);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLUE);
        for (int i = 0; i < count.length; i++) {
            g.drawLine(i * 6 + 6, 475, i * 6 + 6, 475 - 10 * count[i]);
        }
    }
}
