package Bai8.Refactoring;

public class Refactoring {
        public static int calculate(int firstOperand, int secondOperand, char oerator) {
            switch (oerator) {
                case '+':
                    return firstOperand + secondOperand;
                case '-':
                    return firstOperand - secondOperand;
                case '*':
                    return firstOperand * secondOperand;
                case '/':
                    if (secondOperand != 0)
                        return firstOperand / secondOperand;
                    else
                        throw new RuntimeException("Can not divide by 0");
                default:
                    throw new RuntimeException("Unsupported operation");
            }
        }
    }
