public class IosPhone extends SmartPhone{
    public IosPhone(Phone phone) {
        super(phone);
    }
    public String build(){
        return super.build() + addOS();

    }
    private String addOS(){
        return "Apple Os";
    }
}
