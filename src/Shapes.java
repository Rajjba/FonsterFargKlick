import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Shapes extends JPanel implements MouseListener {
    boolean shapeX = false;
    private int SIZEX;
    private int SIZEY;

    public Shapes(int SIZEX, int SIZEY){
        this.SIZEX = SIZEX;
        this.SIZEY = SIZEY;
        this.setBackground(Color.white);
        addMouseListener(this);
        this.setPreferredSize(new Dimension(SIZEX, SIZEY));

        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void ShapeX(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(Color.black);
        g2.drawLine(0,0,SIZEX,SIZEY);
        g2.drawLine(SIZEX,0,0,SIZEY);
    }

    public void ShapeO(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(10));
        g2.drawOval(0,0,SIZEX,SIZEY);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if (shapeX) {
            ShapeX(g);
        }
        else {
            ShapeO(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        shapeX = !shapeX;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
