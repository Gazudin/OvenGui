package states;

import states.OvenState;

/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenContext implements OvenState {

    private OvenState state;

    public void setState(OvenState state){
        this.state = state;
    }

    public OvenState getState(){
        return this.state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
