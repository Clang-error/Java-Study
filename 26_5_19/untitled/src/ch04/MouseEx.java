package ch04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serial;

public class MouseEx extends JFrame implements MouseListener, MouseMotionListener {
    @Serial
    private static final long serialVersionUID = 1L;
    Container c = getContentPane();
    JButton btn=new JButton("Button");
    public MouseEx() {
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MouseTest");
        c.add(btn);
        setVisible(true);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        new MouseEx();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("마우스 클릭됨");
        setTitle("Mouse position: " + e.getX() + ", " + e.getY() + "");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        c.setBackground(Color.red);
//        setBackground(Color.red);
//        System.out.println("마우스 들어옴");
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        c.setBackground(Color.blue);
//        setBackground(Color.blue);
//        System.out.println("마우스 나감");
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

