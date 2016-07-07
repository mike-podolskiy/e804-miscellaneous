//CHECKSTYLE:OFF
package kz.mix.e804;

public class ConvertTest1 {
    public static void main(String[] args) {
        int i = (byte) 4;
        byte b = (byte) i;
        short s = b;
        char c = (char) s;

        // ошибка - несовпадение типов
        // Character c2 = (Byte) (new Byte("4"));

        char c3 = new Character('A').charValue();

        // ошибка - конструктор Byte(int) не существует
//        byte b2 = new Byte(4);

        Float ft = Float.valueOf("45T").floatValue();

        // ошибка - 1) parseFloat возвращает примитив float на котором нельзя вызвать метод floatValue
        // 2) метод floatValue(float) не существует, должно быть floatValue(void)
        // Float ft2 = Float.parseFloat("45T").floatValue(32F);

    }
}
