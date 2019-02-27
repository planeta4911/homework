import creator.AssaultCreator;
import creator.Creator;
import creator.EngineerCreator;
import solider.ISolider;

public class Main {
    public static void main(String[] args) {

        Commander major = Commander.getCommander("MAJOR");
        System.out.println(major.name);

        Creator creatorA = new AssaultCreator();
        ISolider soliderA = creatorA.createSolider();
        major.recruting(soliderA);

        Commander majorTwo = Commander.getCommander("MAJOR2");
        System.out.println(majorTwo.name);

        Creator creatorE = new EngineerCreator();
        ISolider soliderE = creatorE.createSolider();
        majorTwo.recruting(soliderE);

    }
}
