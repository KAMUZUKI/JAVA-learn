package Phone_case;


public class testPhone {
    public static void main(String[] agrs){
        Phone p = new Phone();
        p.brand = "����";
        p.price = 2999;
        System.out.println(p.brand +"..." + p.price);
        p.call("��ǿ");
        p.sendMessage();
    }
}
