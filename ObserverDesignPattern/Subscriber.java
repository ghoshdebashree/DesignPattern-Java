public class Subscriber {
  private String name;
  private Channel channel = new Channel();
  public void update(){
    System.out.println(name + "  Video uploaded  " +channel.title);
  }
  public void subscribechannel(Channel ch){
    channel = ch;
  }
  public Subscriber(String name){
    super();
    this.name = name;
  }
  
}
