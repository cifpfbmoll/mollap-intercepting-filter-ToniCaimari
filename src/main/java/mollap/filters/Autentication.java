package mollap.filters;

public class Autentication implements Filter {
    @Override
    public void execution(String id) {
        System.out.println("Authentication OK for " + id.toString());
    }
}
