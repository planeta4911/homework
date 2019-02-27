package creator;

import solider.Engineer;
import solider.ISolider;

public class EngineerCreator extends Creator {
    @Override
    public ISolider createSolider() {
        return new Engineer();
    }
}

