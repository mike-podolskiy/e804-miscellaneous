package kz.mix.e804.classDesign;

import java.lang.reflect.Field;

class Base {
    private String text = "I'm private field";
    private String again = "Another private field";
}

public class PrivateAccess {
    public static void main(String[] args) throws Exception {
        Base base = new Base();

        Field field = Base.class.getDeclaredField("text");
        field.setAccessible(true);

        System.out.println(field.get(base));


        Field[] fields = Base.class.getDeclaredFields();

        for (Field ff : fields) {
            ff.setAccessible(true);
            System.out.println(ff.get(base));
        }
    }

}
