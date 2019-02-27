import creator.AssaultCreator;
import creator.Creator;
import creator.EngineerCreator;
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

    public void recruting(String typeS){
        if(typeS.equals("Assault")){
            Creator creator = new AssaultCreator();
            ISolider solider = creator.createSolider();
            System.out.println(solider.getName() + " : "+ solider.getWeapon());
        }
        if(typeS.equals("Engineer")){
            Creator creator = new EngineerCreator();
            ISolider solider = creator.createSolider();
            System.out.println(solider.getName() + " : "+ solider.getWeapon());

        }

    }
}
