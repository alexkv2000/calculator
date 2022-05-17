public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 1);
        int b = calc.minus.apply(6, 1);
        // TODO Ошибка :  деление на ноль. Нужна проверка при делении на ноль(знаменателя), выдавать 0.
        //                деление Double 1/3 = 0,33333333

        Double c = calc.devide.apply((double) a, (double) b);
        calc.println.accept(c);
    }
}
