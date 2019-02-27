package solider;

public class Assault implements ISolider {

    @Override
    public String getName() {
        return "Assault";
    }

    @Override
    public String getWeapon() {
        return "AK-47";
    }
}
