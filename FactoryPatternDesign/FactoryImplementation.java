public class FactoryImplementation {
    public Os getInstance(String str){
        if(str.equals("Closed")) return new MacOs();
        else if(str.equals("secured")) return new AndroidOs();
        else return new WindowsOs();
    }
}
