// Task: You have to create a custom calculator with following operations:
// 1.Addition, 2.Subtraction, 3.Multiplication, 4.Division
// which throws the following exceptions:
// 1. Invalid input Exception, for example: 8 & 9
// 2. Cannot divide by 0 Exception
// 3. Max Input Exception if any of the inputs is greater than 10000
// 4. Max Multiply Input Exception that don't allow any multiplication input to be greater than 7000

class MaxInputException extends Exception {
    public String toString() {
        return "Input numbers should not exceed 10000";
    }
}

class MaxMultiplyInputException extends Exception {
    public String toString() {
        return "Input numbers should not exceed 7000";
    }
}

class CannotDivideByZeroException extends Exception {
    public String toString() {
        return "Can't divide by zero!";
    }
}

class InvalidInputException extends Exception {
    public String toString() {
        return "Can't add 8 and 9!";
    }
}

class MyCalculator {
    double add(double x, double y) throws MaxInputException, InvalidInputException {
        if (x > 10000 || y > 10000) {
            throw new MaxInputException();
        }
        if ((x == 8 || y == 9) || (x == 9 || y == 8)) {
            throw new InvalidInputException();
        }
        return x + y;
    }

    double subtract(double x, double y) throws MaxInputException {
        if (x > 10000 || y > 10000) {
            throw new MaxInputException();
        }
        return x - y;
    }

    double divide(double x, double y) throws MaxInputException, CannotDivideByZeroException {
        if (x > 10000 || y > 10000) {
            throw new MaxInputException();
        }
        if (y == 0) {
            throw new CannotDivideByZeroException();
        }
        return x / y;
    }

    double multiply(double x, double y) throws MaxMultiplyInputException {
        if (x > 7000 || y > 7000) {
            throw new MaxMultiplyInputException();
        }
        return x * y;
    }
}

public class Task {
    public static void main(String[] args) throws MaxInputException, MaxMultiplyInputException,
            CannotDivideByZeroException, InvalidInputException {
        MyCalculator calc = new MyCalculator();
        calc.add(8, 9); // throws InvalidInputException
        calc.subtract(100344, 89); // throws MaxInputException
        calc.divide(156, 0); // throws CannotDivideByZeroException
        calc.multiply(7800, 234); // throws MaxMultiplyException
    }
}
