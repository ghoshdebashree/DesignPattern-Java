public class AndroidPhone extends SmartPhone{
    public AndroidPhone(Phone phone) {
        super(phone);
    }
    public String build(){
        return super.build() + addOs();
    }
    public String addOs(){
        return "This is an Android phone";
    }
}
