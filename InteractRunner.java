import java.util.Scanner;
//import Calculator;
/**
 * Класс для запуска калькулятора. Поддерживает ввод пользователя
 */
public class InteractRunner {

	public static void main (String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String first, second, action;
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				first = reader.next();
				System.out.println("Enter second arg: ");
				second = reader.next();
				if (calc.getResult() > 0) {
					System.out.println("Use last result? yes/no");
					action = reader.next();
					if (action.equals("no")) {
						calc.clearRes();
					}
					action = "";
				}
				System.out.println("Enter action: plus, minus, div, mod, mult");
				action = reader.next();
				switch (action) {
					case "plus":
						calc.plus(Float.parseFloat(first), Float.parseFloat(second));
						break;
					case "minus":
						calc.minus(Float.parseFloat(first), Float.parseFloat(second));
						break;
					case "div":
						calc.div(Float.parseFloat(first), Float.parseFloat(second));
						break;
					case "mod":
						calc.mod(Float.parseFloat(first), Float.parseFloat(second));
						break;
					case "mult":
						calc.mult(Float.parseFloat(first), Float.parseFloat(second));
						break;
					default:
						System.out.println("Action not enter =(");
						break;
				}
				System.out.println(calc.getResult());
				System.out.println("Exit: yes/no");
				exit = reader.next();
				action = "";
				first = "0.0";
				second = "0.0";
			}
		} finally {
			reader.close();
		}
	}
}