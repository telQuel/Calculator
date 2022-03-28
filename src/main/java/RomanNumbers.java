import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public String calculate(String[] strings){

        String number1 = strings[0];
        String arithmeticOperation = strings[1];
        String number2 = strings[2];

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);

        int num1 = map.get(number1);
        int num2 = map.get(number2);
        int result = 0;

        switch (arithmeticOperation) {
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
        }
        if (result < 1) {
            throw new IllegalArgumentException();
        }
        String resultStr = convertToRoman(result);
        resultStr = resultStr.replace("LXXXX", "XC");
        resultStr = resultStr.replace("XXXX", "XL");
        resultStr = resultStr.replace("VIIII", "IX");
        resultStr = resultStr.replace("IIII", "IV");
        return resultStr;
    }

    private String convertToRoman(int result) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");

        StringBuilder temp = new StringBuilder();
        int tempNum;

        if (result/100 > 0) {
            temp.append(map.get(100));
            return temp.toString();
        }

        if (result/50 > 0) {
            tempNum = result/50;
            for (int i = 0; i < tempNum; i++) {
                temp.append(map.get(50));
                result-=50;
            }
        }

        if (result >= 1 && result <= 9){
            if (result >= 5 && result <9) {
                temp.append(map.get(5));
                result-=5;
                for (int i = 0; i < result; i++) {
                    temp.append(map.get(1));
                }
            } else {
                for (int i = 0; i < result; i++) {
                    temp.append(map.get(1));
                }
            }
            return temp.toString();
        }

        if (result/10 > 0) {
            tempNum = result/10;
            for (int i = 0; i < tempNum; i++) {
                temp.append(map.get(10));
            }
            tempNum = result%10;

            if (tempNum >= 5 && tempNum < 9) {
                temp.append(map.get(5));
                tempNum-=5;
                for (int i = 0; i < tempNum; i++) {
                    temp.append(map.get(1));
                }
            } else {
                for (int i = 0; i < tempNum; i++) {
                    temp.append(map.get(1));
                }
            }
        }
        return temp.toString();
    }
}
