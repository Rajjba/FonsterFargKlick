import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    final int SIZE=600;
    int cols = 3;
    int rows = cols;
    public Window (){
        this.setTitle("tictactoe");
        this.setPreferredSize(new Dimension(SIZE,SIZE));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(rows, cols));
        for (int i=0; i<cols*rows;i++){
            this.add(new Shapes(SIZE / cols, SIZE / rows));
        }

        this.pack();
        this.setVisible(true);
    }
}
