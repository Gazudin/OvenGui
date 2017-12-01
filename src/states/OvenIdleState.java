package states;

import model.Oven;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenIdleState implements OvenState {

    // Reference to context
    private Oven oven;

    public OvenIdleState(Oven oven){
        this.oven = oven;
    }

    @Override
    public void start(Oven oven) {
        oven.setImageIcon(oven.getHeatingIcon());
        oven.setState(oven.getHeatingState());
        oven.setLamp(true);
        oven.setHeating(true);
        Timer timer = new Timer(6000, new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                //handleEvent(OvenEvent.STOP);
                oven.setImageIcon(oven.getIdleIcon());
                oven.setState(oven.getIdleState());
                oven.setLamp(false);
                oven.setHeating(false);
            }
        });
        timer.start();
    }

    @Override
    public void door(Oven oven) {
        oven.setImageIcon(oven.getOpenIcon());
        oven.setState(oven.getOpenState());
        oven.setLamp(true);
        oven.setHeating(false);
        oven.setDoor(true);
    }
}
