package Phone;

public class phoneDemo{
    public static void main(String[] agrs){
    phone p = new phone();
    System.out.println(p.brand);
    System.out.println(p.price);
    p.brand = "xiaomi";
    p.price = 2999;
    System.out.println(p.brand);
    System.out.println(p.price);

}
}