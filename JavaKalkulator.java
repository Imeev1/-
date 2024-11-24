import java.util.Scanner;

public class JavaKalkulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрос ввода от пользователя
            System.out.print("Введите арифметическое выражение с целыми числами: ");
            String input = scanner.nextLine();

            // проверка формата ввода
            String regex = "\\s*-?\\d+\\s*[+\\-*/]\\s*-?\\d+(\\.\\d+)?\\s*";

            if (input.matches(regex)) {
                // Удаляем лишние пробелы и разделяем выражение
                String[] parts = input.trim().split("(?<=[+\\-*/])|(?=[+\\-*/])");
                int num1 = Integer.parseInt(parts[0].trim());
                String operator = parts[1].trim();
                int num2 = Integer.parseInt(parts[2].trim());
                if (num1>=1 && num1<=10 && num2>=1 && num2<=10) {
                    // Выполняем операцию
                    int result;
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                        default:
                            System.out.println("Неизвестная операция.");
                            return;
                    }

                    // Вывод результата
                    System.out.println("Результат: " + result);
                }
                else {
                    // Вывод ошибки, если формат неверный
                    System.out.println("Ошибка ввода: числа должны быть от 1 до 10 вклюительно.");
                }
            }
            else {
                // Вывод ошибки, если формат неверный
                System.out.println("Ошибка ввода: требуется формат 'Целое число действие Целое число'.");
            }
        }
    }