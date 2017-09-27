import javax.swing.*;

public class JBookQuote extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book quotes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JLabel msg1 = new JLabel("This is my favourite quote");
        frame.add(msg1);
        frame.setVisible(true);
    }
}
