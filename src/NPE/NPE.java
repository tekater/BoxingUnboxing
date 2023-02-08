package NPE;

public class NPE {
    public static void main(String[] args) {
        Long longVal = null;
        //long primitiveLong = longVal; // выведет NPE
        long unboxed = longVal != null ? longVal : 0;
        System.out.println(unboxed);

        //Разложенный тернарный оператор
        long unboxed2;
        if(longVal != null) {
            unboxed2 = longVal;
        }else{
            unboxed2 = 0;
        }
        System.out.println(unboxed2);

    }
}
