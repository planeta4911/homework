public class Main {
    public static void main(String[] args) {

        Commander major = Commander.getCommander("MAJOR");
        System.out.println(major.name);
        major.recruting("Assault");

        Commander majorTwo = Commander.getCommander("MAJOR2");
        System.out.println(majorTwo.name);
        majorTwo.recruting("Engineer");
    }
}
