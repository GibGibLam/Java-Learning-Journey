package fdmgroup.calculator_project;

public class Calculator_Logic {

	public double evaluate(String expression) {
		String expressions = expression.replaceAll(" ", "");
		System.out.println(expressions);
		if (expressions.length() == 1) {
			double result = Double.parseDouble(expressions);
			System.out.println(Math.round(result * 10.0) / 10.0);
			return (Math.round(result * 10.0) / 10.0);
		} else {
			String operators[] = expressions.split("[0-9]+"); // * + - + * - +
			String operands[] = expressions.split("[+-/*]"); // 6 8 7 6 9 5 4 3 8 6
			operators[0] = "0";
//			System.out.println(Arrays.toString(operators));
//			System.out.println(Arrays.toString(operands));

			divisionMethod(operands, operators);
//			System.out.println(Arrays.toString(operands));
//			System.out.println(Arrays.toString(operators));
			multiplicationMethod(operands, operators);
//			System.out.println(Arrays.toString(operands));
//			System.out.println(Arrays.toString(operators));
			subtractionMethod(operands, operators);
//			System.out.println(Arrays.toString(operands));
//			System.out.println(Arrays.toString(operators));
			additionMethod(operands, operators);
//			System.out.println(Arrays.toString(operands));
//			System.out.println(Arrays.toString(operators));

			double result = Double.parseDouble(operands[0]);
			System.out.println(Math.round(result * 10.0) / 10.0);
			return (Math.round(result * 10.0) / 10.0);
		}
	}

	public static String[] divisionMethod(String operands[], String operators[]) {

		for (int i = 0; i < operands.length - 1; i++) {
			if (operators[i + 1].equals("/")) {
				double tempResult = Double.parseDouble(operands[i]) / Double.parseDouble(operands[i + 1]);
//				System.out.println(tempResult);
				operands[i] = Double.toString(tempResult);
				operands[i + 1] = null;
				operators[i + 1] = "0";
				shiftOperands(operands);
				shiftOperator(operators);
			}
		}
		for (int j = 0; j < operands.length - 1; j++) {
			if (operators[j + 1].equals("/")) {
				double tempResult = Double.parseDouble(operands[j]) / Double.parseDouble(operands[j + 1]);
//				System.out.println(tempResult);
				operands[j] = Double.toString(tempResult);
				operands[j + 1] = null;
				operators[j + 1] = "0";
				shiftOperands(operands);
				shiftOperator(operators);
			}
		}
		return operands;
	}

	public static String[] multiplicationMethod(String operands[], String operators[]) {

		for (int i = 0; i < operands.length - 1; i++) {
			if (operators[i + 1].equals("*")) {
				double tempResult = Double.parseDouble(operands[i]) * Double.parseDouble(operands[i + 1]);
//				System.out.println(tempResult);
				operands[i] = Double.toString(tempResult);
				operands[i + 1] = null;
				operators[i + 1] = "0";
				shiftOperands(operands);
				shiftOperator(operators);

			}
		}
		for (int j = 0; j < operands.length - 1; j++) {
			if (operators[j + 1].equals("*")) {
				double tempResult = Double.parseDouble(operands[j]) * Double.parseDouble(operands[j + 1]);
//				System.out.println(tempResult);
				operands[j] = Double.toString(tempResult);
				operands[j + 1] = null;
				operators[j + 1] = "0";
				shiftOperands(operands);
				shiftOperator(operators);
			}
		}
		return operands;
	}

	public static String[] subtractionMethod(String operands[], String operators[]) {

		for (int i = 0; i < operands.length - 1; i++) {
			if (operators[i + 1].equals("-")) {
				double tempResult = Double.parseDouble(operands[i]) - Double.parseDouble(operands[i + 1]);
//				System.out.println(tempResult);
				operands[i] = Double.toString(tempResult);
				operands[i + 1] = null;
				operators[i + 1] = "0";
				shiftOperands(operands);
				shiftOperator(operators);
			}
		}
		for (int j = 0; j < operands.length - 1; j++) {
			if (operators[j + 1].equals("-")) {
				double tempResult = Double.parseDouble(operands[j]) - Double.parseDouble(operands[j + 1]);
//				System.out.println(tempResult);
				operands[j] = Double.toString(tempResult);
				operands[j + 1] = null;
				operators[j + 1] = "0";
				shiftOperands(operands);
				shiftOperator(operators);
			}
		}
		return operands;
	}

	public static String[] additionMethod(String operands[], String operators[]) {

		for (int i = 0; i < operands.length - 1; i++) {
			if (operators[i + 1].equals("+")) {
				double tempResult = Double.parseDouble(operands[i]) + Double.parseDouble(operands[i + 1]);
//				System.out.println(tempResult);
				operands[i] = Double.toString(tempResult);
				operands[i + 1] = null;
				operators[i + 1] = "0";
				shiftOperands(operands);
				shiftOperator(operators);
			}

			for (int j = 0; j < operands.length - 1; j++) {
				if (operators[j + 1].equals("+")) {
					double tempResult = Double.parseDouble(operands[j]) + Double.parseDouble(operands[j + 1]);
//					System.out.println(tempResult);
					operands[j] = Double.toString(tempResult);
					operands[j + 1] = null;
					operators[j + 1] = "0";
					shiftOperands(operands);
					shiftOperator(operators);
				}
			}
		}
		return operands;
	}

	private static void shiftOperands(String operands[]) {
		for (int i = 0; i < (operands.length - 1); i++) {
			if (operands[i] == null && operands[i + 1] != null) {
				operands[i] = operands[i + 1];
				operands[i + 1] = null;
			}
		}
	}

	private static void shiftOperator(String[] operators) {
		for (int i = 1; i < (operators.length - 1); i++) {
			if (operators[i] == "0" && operators[i + 1] != "0") {
				operators[i] = operators[i + 1];
				operators[i + 1] = "0";
			}
		}
	}
}
