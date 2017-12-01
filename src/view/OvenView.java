package view;

import controller.OvenController;
import com.company.OvenEvent;
import model.OvenModel;
import com.company.OvenModelObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenView extends JFrame implements OvenModelObserver {
    private OvenController controller;
    private final JButton startButton = new JButton("Start");
    private final JButton door = new JButton();
    private final JButton tube = new JButton();
    private final JButton lamp = new JButton();
    private final ImageIcon openImage = new ImageIcon("ovenopen.png");
    private final ImageIcon closedImage = new ImageIcon("heatingoven.png");
    private final ImageIcon idleImage = new ImageIcon("ovenidle.png");


    public OvenView(final OvenController controller) {
        this.controller = controller;
        initComponents();
        pack();
    }
    public void update(final OvenModel model) {
        lamp.setBackground(model.isLampOn() ? Color.YELLOW : Color.WHITE);
        door.setIcon(model.isDoorOpen() ? closedImage : openImage);
        tube.setBackground(model.isHeating() ? Color.RED : Color.GREEN);
    }
    private void initComponents() {
        tube.setText("R ö h r e");
        lamp.setText("L a m p e");
        add(createOvenPanel());
    }
    private Component createOvenPanel() {
        JPanel subPanel = new JPanel(new GridLayout(3, 1));
        JPanel mainPanel = new JPanel(new GridLayout(2, 1));
        subPanel.add(startButton);
        subPanel.add(tube);
        subPanel.add(lamp);
        mainPanel.add(subPanel);
        mainPanel.add(door);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                //controller.handleEvent();
                controller.handleStart();
            }
        });
        door.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                //controller.handleEvent();
                controller.handleDoor();
            }
        });
        door.setIcon(closedImage);
        return mainPanel;
    }
}
