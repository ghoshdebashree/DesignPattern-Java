abstract public class SmartPhone implements Phone{
    final Phone phone;
    public SmartPhone(Phone phone){
        this.phone = phone;

    }
    public String build(){
        return "SmartPhone with Basic features";
    }

}
