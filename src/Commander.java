import solider.ISolider;

public final class Commander {

    private static Commander major;
    public String name;

    private  Commander(String name){
        this.name=name;
    }

    public static Commander getCommander(String name) {
        if (major == null) {
            major = new Commander(name);
        }
        return major;
    }

    public void recruting(ISolider solider){
        System.out.println(solider.getName() + " : " + solider.getWeapon());
    }
}
