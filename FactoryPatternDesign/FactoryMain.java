public class FactoryMain {
    public static void main(String[] args) {
        FactoryImplementation imp = new FactoryImplementation();
        Os os = imp.getInstance("Closed");
        os.specifications();
    }
}
