public class Youtube {
  public static void main(String[] args) {
    Channel xyz = new Channel();
    Subscriber s1 = new Subscriber("xyz");
    Subscriber s2 = new Subscriber("abc");
    Subscriber s3 = new Subscriber("tech");
    xyz.subscribe(s1);
    xyz.subscribe(s2);
    xyz.subscribe(s3);
    
    xyz.unsubscribe(s1);

    s1.subscribechannel(xyz);
    s2.subscribechannel(xyz);
    s3.subscribechannel(xyz);

    xyz.upload("How to learn programming ?");

  }
  
}
