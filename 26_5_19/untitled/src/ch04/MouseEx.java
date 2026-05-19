package ch04;

import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serial;

public class MouseEx extends JFrame implements MouseListener {
    @Serial
    private static final long serialVersionUID = 1L;
    public MouseEx() {
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MouseTest");
        setVisible(true);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        new MouseEx();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("마우스 클릭됨");
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

