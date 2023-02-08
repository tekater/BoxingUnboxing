package example2;

public class Example2 {
    public static void main(String[] args) {
        @SuppressWarnings(value = "all") // применяем аннотацию для подавления warnings
        Integer number = new Integer("1001");
        @SuppressWarnings(value = "all")
        Float f = new Float("100.0101");
        @SuppressWarnings(value = "all")
        Long longNumber = new Long("1000000000000000009");
        @SuppressWarnings(value = "all")
        Boolean boolVal = new Boolean("true");

        // также можно создать объект обёрточного класса (wrappers)
        // с помощью спец. метода
        Long longVal = Long.parseLong("100000000");

        // А если нам надо сравнить обёрточные классы друг с другом?

        Long l1 = Long.valueOf("2000");
        Long l2 = Long.valueOf("2000");

        System.out.println("l1 == l2\n" + (l1 == l2)); // false
        System.out.println("l1.equals(l2)\n" + (l1.equals(l2))); // true // если использовать метод equals
    }
}
