import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    FlowLayout flowLayout = new FlowLayout();
    JButton button = new JButton("Click to disable me!");

    public JFrameDisableButton(){
        super("Disabling buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}
