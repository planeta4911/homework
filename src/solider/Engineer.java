package solider;

public class Engineer implements ISolider {

    @Override
    public String getName() {
        return "Engineer";
    }

    @Override
    public String getWeapon() {
        return "Bazooka";
    }
}
