class Calculator{


    public static void main(String[] args) {
        int num1 = 23, num2 = 12;
        
        char operator = '-';

        int result = 0;

        switch(operator){

            case '+':
            result = num1 + num2;
            System.out.println(result + " sum of number");
            break;
            case '/':
            result = num1 / num2;
            System.out.println(result + " divi of number");
            break;

            case '*':
            result = num1 * num2;
            System.out.println(result + " multi of number");
            break;

            case '-':
            result = num1 - num2;
            System.out.println(result + " sub of number");
            break;

            case '%':
            result = num1 % num2;
            System.out.println(result + "rem of number");
            break;

            default:
            System.out.println("invalid operator");

        }
    }
}