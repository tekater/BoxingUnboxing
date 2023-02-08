package ControlExample;

public class ControlExample {
    public static int convert(Long val){
        return val == null ? 0
                : val >= Integer.MAX_VALUE ? Integer.MAX_VALUE
                : val <= Integer.MIN_VALUE ? Integer.MIN_VALUE
                : val.intValue();
    }
    public static void main(String[] args) {
        System.out.println("Введите число:");
        String val = new java.util.Scanner(System.in).nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);

        System.out.println("Вывод: " + convert(longVal));
    }
}
