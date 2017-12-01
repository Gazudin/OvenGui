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
        oven.setLamp(true);
        oven.setHeating(true);
        oven.setState(oven.getHeatingState());
        Timer timer = new Timer(6000, new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                //handleEvent(OvenEvent.STOP);
                oven.setLamp(false);
                oven.setHeating(false);
                oven.setState(oven.getIdleState());
            }
        });
        timer.start();
    }

    @Override
    public void door(Oven oven) {
        oven.setLamp(true);
        oven.setHeating(false);
        oven.setDoor(true);
        oven.setState(oven.getOpenState());
    }
}
