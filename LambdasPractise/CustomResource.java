public class CustomResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Inside Custom Resource Close Method");
    }

    public void readData() {
        System.out.println("Reading Data....");
    }
}
