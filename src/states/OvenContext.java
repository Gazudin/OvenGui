package states;

import model.OvenModel;
import states.OvenState;

/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenContext implements OvenState {

    private OvenState state;
    private OvenModel ovenModel;

    public void setState(OvenState state){
        this.state = state;
    }

    public OvenState getState(){
        return this.state;
    }

    @Override
    public void doAction(OvenModel om) {
        this.state.doAction(om);
    }

    @Override
    public void door(OvenModel om) {
        this.state.door(om);
    }
}
