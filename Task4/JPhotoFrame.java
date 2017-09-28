import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by jc428352 on 29/09/17.
 */
public class JPhotoFrame extends JFrame {

    FlowLayout flowLayout = new FlowLayout();
    ButtonGroup location = new ButtonGroup();
    JCheckBox inStudio = new JCheckBox("In studio", false);
    JCheckBox offSite = new JCheckBox("offSite", false);
    ButtonGroup subject = new ButtonGroup();
    JCheckBox oneSubject = new JCheckBox("One Person", false);
    JCheckBox twoSubjects = new JCheckBox("Two Person", false);
    JCheckBox withPet = new JCheckBox("With Pet", false);
    int baseCost = 40;
    int totalPrice = 0;
    JTextField priceToDisplay = new JTextField();

    public JPhotoFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        priceToDisplay.setText("0");
        add(priceToDisplay);
        setLayout(flowLayout);
        location.add(inStudio);
        add(inStudio);
        inStudio.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    totalPrice += 40;
                }
                else{ totalPrice -= 40;}
                priceToDisplay.setText(""+totalPrice);
            }

        });
        location.add(offSite);
        add(offSite);
        offSite.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    totalPrice += 90;
                }
                else {totalPrice -= 90;}
                priceToDisplay.setText(""+totalPrice);
            }
        });
        subject.add(oneSubject);
        add(oneSubject);
        oneSubject.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    totalPrice += 0;
                }
                else {totalPrice -= 0;}
                priceToDisplay.setText(""+totalPrice);
            }
        });
        subject.add(twoSubjects);
        add(twoSubjects);
        twoSubjects.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    totalPrice += 35;
                }
                else {totalPrice -= 35;}
                priceToDisplay.setText(""+totalPrice);
            }
        });
        subject.add(withPet);
        add(withPet);
        withPet.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    totalPrice += 55;
                }
                else {totalPrice -= 55;}
                priceToDisplay.setText(""+totalPrice);
            }
        });
    }

    public static void main(String[] args) {
        JPhotoFrame frame = new JPhotoFrame();
        frame.setSize(250,250);
        frame.setVisible(true);
    }

}
