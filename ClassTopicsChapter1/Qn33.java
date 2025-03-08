public class Qn33 {

    public static void main(String[] args) {
        
        int primitiveInt = 100;
        double primitiveDouble = 73.5;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Character wrapperChar = Character.valueOf(primitiveChar);
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean);

       
        System.out.println("Boxed Integer: " + wrapperInt);
        System.out.println("Boxed Double: " + wrapperDouble);
        System.out.println("Boxed Character: " + wrapperChar);
        System.out.println("Boxed Boolean: " + wrapperBoolean);

        
        int unboxedInt = wrapperInt.intValue();
        double unboxedDouble = wrapperDouble.doubleValue();
        char unboxedChar = wrapperChar.charValue();
        boolean unboxedBoolean = wrapperBoolean.booleanValue();

      
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
    }
}

