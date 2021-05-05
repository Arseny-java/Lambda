public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        double a = calc.plus.apply(1, 2);
        double b = calc.minus.apply(1, 1);
        double c = calc.devide.apply(a, b); //Деление на 0. Изменил бинарный оператор
        calc.println.accept(c);

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorCallback = System.out::println;
        Worker worker = new Worker(listener, errorCallback);
        worker.start();
    }
}
