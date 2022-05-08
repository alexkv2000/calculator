public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //Ошибка :  деление на ноль. Нужна проверка при делении на ноль(знаменателя), выдавать сообщение. Или выбрасывать исключение ArithmeticException.

        calc.println.accept(c);
    }
}
