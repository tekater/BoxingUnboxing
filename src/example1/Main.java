package example1;

public class Main {
    public static void main(String[] args){
        //Boxing
        int primitive = 100;
        Integer reference = Integer.valueOf(primitive);

        //Unboxing
        int anotherPrimitive = reference.intValue();

        //AutoBoxing
        double primitiveDouble = 10.0;

        Double wrapperDouble = primitiveDouble; // AutoBoxing
        double anotherPrimitiveDouble = wrapperDouble; // AutoUnboxing

        //AutoBoxing - работает только тогда, когда левая и правая части принадлежат одному типу.
        Long n1 = 10L; // working
        Integer n2 = 10; // working
        //Long n3= 10; //error
        //Integer n4= 10L; //error

    }
}
