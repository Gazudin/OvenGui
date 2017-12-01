package states;

import model.Oven;

/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenOpenState implements OvenState {

    // Reference to context
    private Oven oven;

    public OvenOpenState(Oven oven){
        this.oven = oven;
    }

    @Override
    public void start(Oven oven) {

    }

    @Override
    public void door(Oven oven) {
        oven.setDoor(false);
        oven.setLamp(false);
        oven.setImageIcon(oven.getIdleIcon());
        oven.setState(oven.getIdleState());
    }
}
