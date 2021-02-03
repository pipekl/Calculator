public class Calculate {

    public int result (int value1, int value2, String calculate) {
        switch (calculate) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
        }
        return 0;
    }

    public String searchCalculate (String string) {
        if (string.indexOf("+") > 0)
            return "+";
        if (string.indexOf("-") > 0)
            return "-";
        if (string.indexOf("*") > 0)
            return "*";
        if (string.indexOf("/") > 0)
            return "/";
        return "";
    }
}
