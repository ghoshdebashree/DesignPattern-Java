public class SingletonClass {
    private static SingletonClass sc = null;
    private SingletonClass(){
    }
    public static void  Singletoprint(){
        System.out.println("hello");
    }
    public static SingletonClass getInstance(){
        if(sc == null)
            sc = new SingletonClass();
        return sc;
    }
}
class demoSingleton{
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        obj.Singletoprint();

    }
}
