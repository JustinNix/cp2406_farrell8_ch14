import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {

    FlowLayout flowLayout = new FlowLayout();
    JLabel label1 = new JLabel("Fact 1");
    JLabel label2 = new JLabel("Fact 2");
    JLabel label3 = new JLabel("Fact 3");
    JLabel label4 = new JLabel("Fact 4");
    JLabel label5 = new JLabel("Fact 5");
    JButton button = new JButton("Click me for a new fact");
    int count = 0;

    public JHistoricalFacts(){
        super("Historical Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        add(button);
        button.addActionListener(this);

        add(label1).setVisible(false);
        add(label2).setVisible(false);
        add(label3).setVisible(false);
        add(label4).setVisible(false);
        add(label5).setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ++count;
        if(count ==6){
            count = 0;
        }
        else if(count == 1){
            label1.setVisible(true);
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
        }
        else if(count ==2){
            label1.setVisible(false);
            label2.setVisible(true);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
        }
        else if(count ==3){
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(true);
            label4.setVisible(false);
            label5.setVisible(false);
        }
        else if(count ==4){
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(true);
            label5.setVisible(false);
        }
        else {
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(true);
        }
    }

    public static void main(String[] args) {
        JHistoricalFacts frame = new JHistoricalFacts();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
