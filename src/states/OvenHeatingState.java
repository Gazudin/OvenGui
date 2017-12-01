package states;

import model.OvenModel;

import javax.naming.Context;

/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenHeatingState implements OvenState {

    // Reference to context
    private OvenContext context;

    public OvenHeatingState(OvenContext context){
        this.context = context;
    }

    @Override
    public void doAction(OvenContext oontext) {

    }

    @Override
    public void door(OvenContext oontext) {

    }
}
