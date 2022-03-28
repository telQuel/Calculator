public class ArabicNumbers {
    public int calculate(String[] strings){
        int number1;
        String arithmeticOperation;
        int number2;
        int result = 0;
        number1 = Integer.parseInt(strings[0]);
        arithmeticOperation = strings[1];
        number2 = Integer.parseInt(strings[2]);

        switch (arithmeticOperation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return result;
    }
}
