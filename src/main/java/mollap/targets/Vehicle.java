package mollap.targets;

public class Vehicle implements Target {
    @Override
    public void execution(String id) {
        System.out.println("Open door " + id.toString() + "!");
    }
}
