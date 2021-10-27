public class DecoratorDemoClass {
    public static void main(String[] args) {
        Phone android = new AndroidPhone(new BasicPhone());
        Phone ios = new IosPhone(new BasicPhone());
        System.out.println(" " +android.build()+" ");
        System.out.println("*************************");
        System.out.println(" "+ios.build()+" ");

    }
}
