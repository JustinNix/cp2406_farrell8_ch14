import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener {
    FlowLayout flowLayout = new FlowLayout();
    JButton button = new JButton("Click to disable me!");
    int count = 0;
    JLabel label = new JLabel("Thats enough");

    public JFrameDisableButton2(){
        super("Disabling buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        add(button);
        add(label);
        label.setVisible(false);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        if(count == 8) {
            button.setEnabled(false);
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}
