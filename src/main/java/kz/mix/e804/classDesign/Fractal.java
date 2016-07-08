//CHECKSTYLE:OFF
package kz.mix.e804.classDesign;

public class Fractal {
    public static void main(String[] args) {
        Fractal ft = new SubFractal();

        // Ошибка компиляции - таким образом преобразуется конечный результат
        // String s = (Fractal) ft.getOb().getMsg();

        // А вот так выглядит правильный каст
        String s = ((Fractal) ft.getOb()).getMsg();

        System.out.println(s);
    }

    public Object getOb() {
        return new Fractal();
    }

    public String getMsg() {
        return "SuperStar";
    }
}

class SubFractal extends Fractal {
    public Object getOb() {
        return new Fractal();
    }

    public String getMsg() {
        new Short("");
        return "SubStar";
    }
}

