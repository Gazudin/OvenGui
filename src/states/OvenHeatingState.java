package states;

import model.Oven;
import model.OvenModel;

import javax.naming.Context;

/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenHeatingState implements OvenState {

    // Reference to context
    private Oven oven;

    public OvenHeatingState(Oven oven){
        this.oven = oven;
    }

    @Override
    public void start(Oven oven) {
        oven.setHeating(false);
        oven.setState(oven.getIdleState());
    }

    @Override
    public void door(Oven oven) {
        oven.setHeating(false);
        oven.setLamp(true);
        oven.setState(oven.getOpenState());
    }
}
