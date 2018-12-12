import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel  implements ActionListener, KeyListener, MouseListener, MouseMotionListener {
    private int mouseXClick;
    private int mouseYClick;
    private int mouseXLeft=0;
    private int mouseYLeft=0;
    private int mouseXRight=0;
    private int mouseYRight=0;

    private Tool tool;
    private boolean mouseYAtiva;

    Panel() {
        this.tool = new Tool();
        Timer t = new Timer(5, this);
        t.start();
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
    }

    public void paint(Graphics graphics) {
        this.tool.addGraphics(graphics);
        this.tool.setSize(800, 600);
        this.tool.cls();
        this.tool.addStep();
        build();
    }

    private void build() {
        Mirror mirror = new Mirror(this.tool);
        this.tool.write(10,10,"STEP: "+this.tool.getStep());
        this.tool.circle(this.tool.getWidth() / 2 ,this.tool.getHeight() / 2,Color.blue,100);
        this.tool.circle(this.mouseXClick, this.mouseYClick,Color.black,5);
        this.tool.circle(this.mouseXLeft, this.mouseYLeft,Color.GREEN,5);
        this.tool.circle(this.mouseXRight, this.mouseYRight,Color.red,5);
        if(this.mouseYAtiva) {
            mirror.focus(this.mouseXLeft, this.mouseYLeft, this.mouseXRight, this.mouseYRight);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseXClick = e.getX();
        mouseYClick = e.getY();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseDragged(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1) {
            mouseXLeft = e.getX();
            mouseYLeft = e.getY();
        }
        if(e.getButton() == MouseEvent.BUTTON2) {
            // label.setText("Middle Click!");
        }
        if(e.getButton() == MouseEvent.BUTTON3) {
            mouseXRight = e.getX();
            mouseYRight = e.getY();
        }
        this.mouseYAtiva = true;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.mouseYAtiva = false;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
