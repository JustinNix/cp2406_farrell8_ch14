import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JVacationRental extends JFrame implements ActionListener, ItemListener {
    FlowLayout flowLayout = new FlowLayout();
    ButtonGroup locationGroup = new ButtonGroup();
    JCheckBox park = new JCheckBox("Parkside", false);
    JCheckBox pool = new JCheckBox("Poolside", false);
    JCheckBox lake = new JCheckBox("Lakeside", false);
    ButtonGroup numRoomsGroup = new ButtonGroup();
    JCheckBox oneRoom = new JCheckBox("One Room", false);
    JCheckBox twoRoom = new JCheckBox("Two Room", false);
    JCheckBox threeRoom = new JCheckBox("Three Room", false);
    ButtonGroup mealsGroup = new ButtonGroup();
    JCheckBox noMeals = new JCheckBox("No meals", false);
    JCheckBox meals = new JCheckBox("Meals", false);
    int totalPrice = 0;
    JTextField totalPriceDisp = new JTextField(10);
    String out;

    public JVacationRental(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        locationGroup.add(park);
        park.addItemListener(this);
        locationGroup.add(pool);
        pool.addItemListener(this);
        locationGroup.add(lake);
        lake.addItemListener(this);
        numRoomsGroup.add(oneRoom);
        oneRoom.addItemListener(this);
        numRoomsGroup.add(twoRoom);
        twoRoom.addItemListener(this);
        numRoomsGroup.add(threeRoom);
        threeRoom.addItemListener(this);
        mealsGroup.add(noMeals);
        noMeals.addItemListener(this);
        mealsGroup.add(meals);
        meals.addItemListener(this);
        add(park);
        add(pool);
        add(lake);
        add(oneRoom);
        add(twoRoom);
        add(threeRoom);
        add(meals);
        add(noMeals);
        totalPriceDisp.setText("0");
        add(totalPriceDisp);
    }

    public static void main(String[] args) {
        JVacationRental frame = new JVacationRental();
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        Object source = e.getItem();
        if(source==park){
            int selected = e.getStateChange();
            if(selected == ItemEvent.SELECTED){
                totalPrice += 600;
            }
            else if(selected == ItemEvent.DESELECTED){
                totalPrice -= 600;
            }
            totalPriceDisp.setText(""+totalPrice);
        }
        if(source==pool){
            int selected = e.getStateChange();
            if(selected == ItemEvent.SELECTED){
                totalPrice += 750;
            }
            else if(selected == ItemEvent.DESELECTED){
                totalPrice -= 750;
            }
            totalPriceDisp.setText(""+totalPrice);
        }
        if(source==lake){
            int selected = e.getStateChange();
            if(selected == ItemEvent.SELECTED){
                totalPrice += 825;
            }
            else if(selected == ItemEvent.DESELECTED){
                totalPrice -= 825;
            }
            totalPriceDisp.setText(""+totalPrice);
        }
        if(source==oneRoom){
            int selected = e.getStateChange();
            if(selected == ItemEvent.SELECTED){
                totalPrice += 75;
            }
            else if(selected == ItemEvent.DESELECTED){
                totalPrice -= 75;
            }
            totalPriceDisp.setText(""+totalPrice);
        }
        if(source==twoRoom){
            int selected = e.getStateChange();
            if(selected == ItemEvent.SELECTED){
                totalPrice += 75*2;
            }
            else if(selected == ItemEvent.DESELECTED){
                totalPrice -= 75*2;
            }
            totalPriceDisp.setText(""+totalPrice);
        }
        if(source==threeRoom){
            int selected = e.getStateChange();
            if(selected == ItemEvent.SELECTED){
                totalPrice += 75*3;
            }
            else if(selected == ItemEvent.DESELECTED){
                totalPrice -= 75*3;
            }
            totalPriceDisp.setText(""+totalPrice);
        }
        if(source==meals){
            int selected = e.getStateChange();
            if(selected == ItemEvent.SELECTED){
                totalPrice += 200;
            }
            else if(selected == ItemEvent.DESELECTED){
                totalPrice -= 200;
            }
            totalPriceDisp.setText(""+totalPrice);
        }

    }
}
