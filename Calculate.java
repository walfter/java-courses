public class Calculate {

	public static void main(String[] arg){
		System.out.println("Calculate...");

		String add = "Not calculated =(";

		float first = Float.parseFloat(arg[0]);
		float second = Float.parseFloat(arg[2]);

		float summ;
		switch (arg[1]) {
			case "+":
				add = "The sum of the numbers " + Float.toString(first) + " and " + Float.toString(second) + " is ";
				summ = 0;
				summ = first + second;
				break;
			case "-":
				add = "The difference between of the numbers " + Float.toString(first) + " and " + Float.toString(second) + " is ";
				summ = 0;
				summ = first - second;
				break;
			case "x":
				add = "The multiplication of the numbers" + Float.toString(first) + " and " + Float.toString(second) + " is ";
				summ = 0;
				summ = first * second;
				break;
			case "/":
				add = "The division of the numbers " + Float.toString(first) + " by " + Float.toString(second) + " equals ";
				summ = 0;
				summ = first / second;
				break;
			case "mod":
				add = "The remainder of dividing " + Float.toString(first) + " by " + Float.toString(second) + " equals ";
				summ = 0;
				summ = first % second;
				break;
			default:
				add = "Sorry something error. Not calculated";
				summ = 0;
				break;
		}
		System.out.println(add + summ);
	}

}