package states;

import model.Oven;


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
    }

    @Override
    public void door(Oven oven) {
    }
}
