package states;

import model.OvenModel;


/**
 * Created by Marcel on 27.11.2017.
 */
public class OvenIdleState implements OvenState {

    // Reference to context
    private OvenContext context;

    public OvenIdleState(OvenContext context){
        this.context = context;
    }

    @Override
    public void doAction(OvenContext oontext) {
    }

    @Override
    public void door(OvenContext oontext) {
    }
}
