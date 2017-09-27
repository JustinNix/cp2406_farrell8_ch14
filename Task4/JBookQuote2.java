import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("MY favourite quote");
    JButton button = new JButton("Click for book title");
    JLabel title = new JLabel("My Favourite book");


    public JBookQuote2()
    {
        super("Books");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(title);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(500, 500);
        aFrame.setVisible(true);
    }
}