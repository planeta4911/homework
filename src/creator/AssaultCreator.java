package creator;

import solider.Assault;
import solider.ISolider;

public class AssaultCreator extends Creator {
    @Override
    public ISolider createSolider() {
        return new Assault();
    }
}
