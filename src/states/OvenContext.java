package states;

import model.OvenModel;
import states.OvenState;

/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenContext {

    private OvenState state;
    private OvenModel ovenModel;

    public OvenContext(OvenModel oven){
        setState(new OvenIdleState(this));
    }

    public void setState(OvenState state){
        this.state = state;
    }

    public OvenState getState(){
        return this.state;
    }

    public void start(){

    }

    public void door(){

    }

}
