package a_One.g_Seven.b_Two.BigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10");
        BigDecimal bd2 = new BigDecimal("20");
        BigDecimal add = bd1.add(bd2);
        System.out.println("和为 " + add);

        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("差为" + subtract);

        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("积为" + multiply);

        BigDecimal divide = bd1.divide(bd2);
        System.out.println("商为" + divide);
    }
}
