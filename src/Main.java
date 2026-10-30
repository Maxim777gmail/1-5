public class Main {
    public static void main(String[] args) {
        // Проверка: переданы ли аргументы
        if (args.length == 0) {
            System.out.println("Пожалуйста, передайте целые числа в качестве аргументов командной строки.");
            return;
        }

        int sum = 0;
        long product = 1; // Используем long для произведения, чтобы избежать переполнения

        try {
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sum += num;
                product *= num;
            }

            System.out.println("Сумма чисел: " + sum);
            System.out.println("Произведение чисел: " + product);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: один из аргументов не является целым числом.");
        }
    }
}
