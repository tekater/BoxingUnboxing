package ControlWork;

public class Control {
        public static int convert(Long val){
            if (val == null) {
                Integer input = Integer.parseInt(String.valueOf(val));
                System.out.println("Значение было null:");
                return input;
            }else if (val > Integer.MAX_VALUE){
                Integer input = 2147483647;
                System.out.println("Значение val было преобразовано в максимальное число int");
                return input;
            }else if (val < Integer.MIN_VALUE){
                Integer input = Integer.MIN_VALUE;
                System.out.println("Значение val было преобразовано в минимальное число int");
                return input;
            }else {
                System.out.println("Прочий случай");
                return Integer.parseInt(String.valueOf(val));
            }
        }
        public static void main(String[] args) {
            System.out.println("Введите число:");
            String val = new java.util.Scanner(System.in).nextLine();
            Long longVal = "null".equals(val) ? null : Long.parseLong(val);

            System.out.println("Вывод: " + convert(longVal));
    }
}
