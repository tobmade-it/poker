package poker2.draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

class Surface extends JPanel implements ActionListener {

    private final int DELAY = 150;
    private Timer timer;

    public Surface() {
    	
    	this.setBackground(new Color(56,56,56));
        initTimer();
    }

    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }
    
    public Timer getTimer() {
        
        return timer;
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.blue);
        
        int w = getWidth();
        int h = getHeight();
        
        int tableWidth  = (int) (w *0.8);
        int tableHeight = (int) (h *0.8);
        int tablePosX = (w-tableWidth)/2;
        int tablePosY = (h-tableHeight)/2;
        
        g2d.setPaint(new Color(56,255,194));
        g2d.fillOval(tablePosX, tablePosY, tableWidth, tableHeight);
        
        int circleRadius = 100;
        
        final BasicStroke stroke =
            new BasicStroke(7.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f);
        g2d.setStroke(stroke);
        
        // stroke color
        g2d.setPaint(new Color(122,122,122));
        
        // drawing centered circles (strokes)
        g2d.draw( new Ellipse2D.Double( // top
        		(int) ((w/2)-(circleRadius/2)),  (int) (h*0.1-(circleRadius/2)), circleRadius, circleRadius));
        g2d.draw( new Ellipse2D.Double( // bottom
        		(int) ((w/2)-(circleRadius/2)),  (int) (h*0.9-(circleRadius/2)), circleRadius, circleRadius));
        g2d.draw( new Ellipse2D.Double( // left
        		(int) (w*0.1-(circleRadius/2)),  (int) (h/2)-(circleRadius/2),   circleRadius, circleRadius));
        g2d.draw( new Ellipse2D.Double( // right
        		(int) (w*0.9-(circleRadius/2)),  (int) (h/2)-(circleRadius/2),   circleRadius, circleRadius));
        
        // drawing circles between the centered ones (strokes)
        g2d.draw( new Ellipse2D.Double( // top-left
        		(int) (w*0.22-(circleRadius/2)), (int) (h*0.22)-(circleRadius/2), circleRadius, circleRadius)); 
        g2d.draw( new Ellipse2D.Double( // bottom-left
        		(int) (w*0.22-(circleRadius/2)), (int) (h*0.78)-(circleRadius/2), circleRadius, circleRadius)); 
        g2d.draw( new Ellipse2D.Double( // top-right
        		(int) (w*0.78-(circleRadius/2)), (int) (h*0.22)-(circleRadius/2), circleRadius, circleRadius)); 
        g2d.draw( new Ellipse2D.Double( // bottom-right
        		(int) (w*0.78-(circleRadius/2)), (int) (h*0.78)-(circleRadius/2), circleRadius, circleRadius));
        
        // fill color
        g2d.setPaint(new Color(255,85,93));
        
        // fill all circles with a color
        g2d.fill( new Ellipse2D.Double( // top
        		(int) ((w/2)-(circleRadius/2)),  (int) (h*0.1-(circleRadius/2)), circleRadius, circleRadius));
        g2d.fill( new Ellipse2D.Double( // bottom
        		(int) ((w/2)-(circleRadius/2)),  (int) (h*0.9-(circleRadius/2)), circleRadius, circleRadius));
        g2d.fill( new Ellipse2D.Double( // left
        		(int) (w*0.1-(circleRadius/2)),  (int) (h/2)-(circleRadius/2),   circleRadius, circleRadius));
        g2d.fill( new Ellipse2D.Double( // right
        		(int) (w*0.9-(circleRadius/2)),  (int) (h/2)-(circleRadius/2),   circleRadius, circleRadius));
        
        g2d.fill( new Ellipse2D.Double( // top-left
        		(int) (w*0.22-(circleRadius/2)), (int) (h*0.22)-(circleRadius/2), circleRadius, circleRadius)); 
        g2d.fill( new Ellipse2D.Double( // bottom-left
        		(int) (w*0.22-(circleRadius/2)), (int) (h*0.78)-(circleRadius/2), circleRadius, circleRadius)); 
        g2d.fill( new Ellipse2D.Double( // top-right
        		(int) (w*0.78-(circleRadius/2)), (int) (h*0.22)-(circleRadius/2), circleRadius, circleRadius)); 
        g2d.fill( new Ellipse2D.Double( // bottom-right
        		(int) (w*0.78-(circleRadius/2)), (int) (h*0.78)-(circleRadius/2), circleRadius, circleRadius));
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}